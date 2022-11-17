package Lesson7.Task3;

import java.util.Date;

public abstract class Document {
    int documentNumber;
    Date documentDate;

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
