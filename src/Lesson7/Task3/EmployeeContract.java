package Lesson7.Task3;

import java.util.Date;

public class EmployeeContract extends Document {
    Date contractEndDate;
    String employeeName;

    public EmployeeContract(int documentNumber, Date documentDate, Date contractEndDate, String employeeName) {
        super(documentNumber, documentDate);
        this.contractEndDate = contractEndDate;
        this.employeeName = employeeName;
    }

    public EmployeeContract() {
    }

    @Override
    public String toString() {
        return "\t\nКонтракт на поставку товара" + "\t\nНомер документа: " + documentNumber + "\t\nДата документа: "
                + documentDate + "\t\nДата окончания контракта: " + contractEndDate + "\t\nИмя работника: " + employeeName;
    }
}
