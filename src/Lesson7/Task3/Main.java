package Lesson7.Task3;

import java.util.Calendar;
import java.util.Date;

/**
 * Создать систему для учета документов.
 */

public class Main {
    public static void main(String[] args) {

        Date date = new Date(2022, Calendar.NOVEMBER, 17);
        Register register = new Register();
        SupplyGoodsContract supplyGoodsContract = new SupplyGoodsContract(0, date,
                "Пиротехника", 15);
        FinancialInvoice financialInvoice = new FinancialInvoice(1, date, 150.89, 12345);
        EmployeeContract employeeContract = new EmployeeContract(2, date, date, "Антон");

        register.addDocument(supplyGoodsContract);
        register.addDocument(financialInvoice);
        register.addDocument(employeeContract);
        register.printDocumentInfo(supplyGoodsContract.documentNumber);
        register.printDocumentInfo(financialInvoice.documentNumber);
        register.printDocumentInfo(employeeContract.documentNumber);
    }
}
