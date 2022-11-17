package Lesson7.Task3;

public class Register implements Registerable {

    Document[] documents = new Document[10];

    @Override
    public void addDocument(Document document) {
        for (int i = 0; i < documents.length; i++) {
            if (documents[i] != null) {
                if (documents[i].documentNumber == document.documentNumber) {
                    System.out.println("Такой документ уже есть");
                    break;
                } else if (i == documents.length - 1) {
                    System.out.println("Регистр заполнен");
                    break;
                }
            } else {
                documents[i] = document;
                break;
            }
        }
    }

    @Override
    public void printDocumentInfo(Document document) {
        System.out.println(document);
    }
}
