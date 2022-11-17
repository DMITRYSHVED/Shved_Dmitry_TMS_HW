package Lesson7.Task3;

public class Register implements SaveAndPrintable {
    Document[] documents = new Document[10];

    @Override
    public void addDocument(Document document) {
        documents[document.documentNumber] = document;
    }

    @Override
    public void printDocumentInfo(int documentNumber) {
        System.out.println(documents[documentNumber]);
    }
}
