package Lesson7.Task3.Documents;

import java.util.Date;

public abstract class Document {
    public int documentNumber;
    public Date documentDate;

    public Document(int documentNumber, Date documentDate) {
        this.documentDate = documentDate;
        this.documentNumber = documentNumber;
    }

    public Document() {
    }

    public static int createDocumentNumber() {
        return (int) Math.abs(Math.random() * 1000000);
    }
}
