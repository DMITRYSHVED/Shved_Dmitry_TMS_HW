package Lesson7.Task3;

import java.util.Date;

public abstract class Document {
    int documentNumber;
    Date documentDate;

    public Document(int documentNumber, Date documentDate) {
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
    }

    public Document() {
    }
}
