package Lesson7.Task3;

import java.util.Date;

public class FinancialInvoice extends Document {
    double monthlyTotal;
    int departmentCod;

    public FinancialInvoice(int documentNumber, Date documentDate, double monthlyTotal, int departmentCod) {
        super(documentNumber, documentDate);
        this.monthlyTotal = monthlyTotal;
        this.departmentCod = departmentCod;
    }

    public FinancialInvoice() {
    }

    @Override
    public String toString() {
        return "\t\nКонтракт на поставку товара" + "\t\nНомер документа: " + documentNumber + "\t\nДата документа: " + documentDate
                + "\t\nИтоговая сумма за месяц: " + monthlyTotal + "\t\nКод департамента: " + departmentCod;
    }
}
