package Lesson7.Task3;

import Lesson7.Task3.Documents.Document;
import Lesson7.Task3.Documents.EmployeeContract;
import Lesson7.Task3.Documents.FinancialInvoice;
import Lesson7.Task3.Documents.SupplyGoodsContract;
import Lesson7.Task3.Register.Register;

import java.time.Instant;
import java.util.Date;

/**
 * Создать систему для учета документов.
 */

public class Main {
    public static void main(String[] args) {

        Register register = new Register();
        SupplyGoodsContract supplyGoodsContract = new SupplyGoodsContract(Document.createDocumentNumber(),
                Date.from(Instant.now()), "Пиротехника", 15);
        FinancialInvoice financialInvoice = new FinancialInvoice(Document.createDocumentNumber(),
                Date.from(Instant.now()), 150.89, 12345);
        EmployeeContract employeeContract = new EmployeeContract(Document.createDocumentNumber(),
                Date.from(Instant.now()), Date.from(Instant.now()), "Антон");

        register.addDocument(supplyGoodsContract);
        register.addDocument(financialInvoice);
        register.addDocument(employeeContract);
        for (int i = 0; i < register.documents.length; i++) {
            if (register.documents[i] != null) {
                register.printDocumentInfo(register.documents[i]);
            }
        }
    }
}
