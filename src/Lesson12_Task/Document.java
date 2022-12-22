package Lesson12_Task;

import java.io.*;
import java.util.*;

//FILE.separator

public class Document {

    public static final String DOCNUM = "docnum";
    public static final String CONTRACT = "contract";
    public static final String VALID = "<VALID>";
    public static final String INVALID = "<INVALID>";
    private static String comment;
    private static Scanner scanner = new Scanner(System.in);
    private static File file;
    private static File reportFile;
    private static ArrayList<File> files = new ArrayList<>();
    private static HashSet<String> uniqueDocumentNumbers = new HashSet<>();
    private static HashMap<String, String> processedDocumentNumbers = new HashMap<>();

    private static ArrayList<File> goToFile() throws IOException {

        while (true) {
            System.out.println("Введите путь к документу: \n0- выход");
            String path = scanner.nextLine();
            if (path.equals("0")) {
                break;
            }
            file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
            files.add(file);
        }
        return files;
    }

    private static void uniqueDocument(ArrayList<File> files) throws IOException {

        String documentNumber;

        for (int i = 0; i < files.size(); i++) {
            Reader reader = new FileReader(files.get(i));
            try (reader) {
                BufferedReader bufferedReader = new BufferedReader(reader);
                while ((documentNumber = bufferedReader.readLine()) != null) {
                    if (documentNumber.isEmpty()) {
                        continue;
                    }
                    uniqueDocumentNumbers.add(documentNumber);
                }
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for (String uniqueNumber : uniqueDocumentNumbers) {
            try {
                checkDocumentNumber(uniqueNumber);
            } catch (
                    DocumentInvalidException e) {
                System.err.println(e.getMessage());
            }
        }
        writeToReportFile(processedDocumentNumbers);
    }

    private static void checkDocumentNumber(String uniqueNumber) throws DocumentInvalidException {

        if (uniqueNumber.length() == 15) {
            if (uniqueNumber.startsWith(DOCNUM) || uniqueNumber.startsWith(CONTRACT)) {
                comment = VALID;
                processedDocumentNumbers.put(uniqueNumber, comment);
            } else {
                comment = INVALID + WrongStartCombinationException.DESCRIPTION;
                processedDocumentNumbers.put(uniqueNumber, comment);
                throw new WrongStartCombinationException(DocumentInvalidException.INVALID + uniqueNumber + comment);
            }
        } else {
            if (uniqueNumber.startsWith(DOCNUM) || uniqueNumber.startsWith(CONTRACT)) {
                comment = INVALID + WrongDocumentLengthException.DESCRIPTION;
                processedDocumentNumbers.put(uniqueNumber, comment);
                throw new WrongDocumentLengthException(DocumentInvalidException.INVALID + uniqueNumber + comment);
            } else {
                comment = INVALID + WrongDocumentLengthException.DESCRIPTION + WrongStartCombinationException.DESCRIPTION;
                processedDocumentNumbers.put(uniqueNumber, comment);
                throw new DocumentInvalidException(DocumentInvalidException.INVALID + uniqueNumber + comment);
            }
        }
    }

    public static void showDocument() {

        try {
            uniqueDocument(goToFile());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void writeToReportFile(HashMap<String, String> processedDocumentNumbers) throws IOException {

        reportFile = new File("REPORT_FILE");
        if (!reportFile.exists()) {
            reportFile.createNewFile();
        }
        Writer writer = new FileWriter(reportFile);
        try (writer) {
            writer.write(reportFile.getName() + "\n");
            for (Map.Entry<String, String> documentNumber : processedDocumentNumbers.entrySet()) {
                writer.write("\n\t" + documentNumber.getKey() +" " +documentNumber.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
