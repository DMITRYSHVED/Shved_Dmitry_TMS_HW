package Lesson12_Task;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

//FILE.separator
public class Document {

    public static final String DOCNUM = "docnum";
    public static final String CONTRACT = "contract";
    private static String invalidDescription;
    private static Scanner scanner = new Scanner(System.in);
    private static File file;
    private static File validFile;
    private static File invalidFile;
    private static ArrayList<String> invalidNumbers = new ArrayList<>();
    private static ArrayList<String> validNumbers = new ArrayList<>();

    private static File goToFile() throws IOException {

        System.out.println("Введите путь к документу: ");
        String path = scanner.nextLine();
        file = new File(path);
        if (!file.exists()) {
            file.createNewFile();
        }
        return file;
    }

    private static void documentValid(File file) throws IOException {

        String documentNumber;
        Reader reader = new FileReader(file);

        try (reader) {
            BufferedReader bufferedReader = new BufferedReader(reader);
            System.out.println("DOCUMENT_NUMBERS");
            while ((documentNumber = bufferedReader.readLine()) != null) {
                documentNumber = documentNumber.trim();
                if (documentNumber.equals(file.getName()) || documentNumber.isEmpty()) {
                    continue;
                }
                System.out.println("\t" + documentNumber);
                try {
                    checkDocumentNumber(documentNumber);
                } catch (DocumentInvalidException e) {
                    System.err.println(e.getMessage());
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        validReportFile(validNumbers);
        invalidReportFile(invalidNumbers);
    }

    private static void checkDocumentNumber(String documentNumber) throws DocumentInvalidException {

        if (documentNumber.length() == 15) {
            if (documentNumber.startsWith(DOCNUM) || documentNumber.startsWith(CONTRACT)) {
                validNumbers.add(documentNumber);
            } else {
                invalidDescription = WrongStartCombinationException.DESCRIPTION;
                documentNumber = documentNumber + invalidDescription;
                invalidNumbers.add(documentNumber);
                throw new WrongStartCombinationException(DocumentInvalidException.INVALID + documentNumber);
            }
        } else {
            if (documentNumber.startsWith(DOCNUM) || documentNumber.startsWith(CONTRACT)) {
                invalidDescription = WrongDocumentLengthException.DESCRIPTION;
                documentNumber = documentNumber + invalidDescription;
                invalidNumbers.add(documentNumber);
                throw new WrongDocumentLengthException(DocumentInvalidException.INVALID + documentNumber);
            } else {
                invalidDescription = WrongDocumentLengthException.DESCRIPTION +
                        WrongStartCombinationException.DESCRIPTION;
                documentNumber = documentNumber + invalidDescription;
                invalidNumbers.add(documentNumber);
                throw new DocumentInvalidException(DocumentInvalidException.INVALID + documentNumber);
            }
        }
    }

    public static void showDocument() {

        try {
            documentValid(goToFile());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void validReportFile(ArrayList<String> validNumbers) throws IOException {

        validFile = new File("VALID_REPORT_FILE");
        if (!validFile.exists()) {
            validFile.createNewFile();
        }
        Writer writer = new FileWriter(validFile);
        try (writer) {
            writer.write(validFile.getName() + "\n");
            for (String validNumber : validNumbers) {
                writer.write("\n\t" + validNumber);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void invalidReportFile(ArrayList<String> invalidNumbers) throws IOException {

        invalidFile = new File("INVALID_REPORT_FILE");
        if (!invalidFile.exists()) {
            invalidFile.createNewFile();
        }
        Writer writer = new FileWriter(invalidFile);
        try (writer) {
            writer.write(invalidFile.getName() + "\n");
            for (String invalidNumber : invalidNumbers) {
                writer.write("\n\t" + invalidNumber);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
