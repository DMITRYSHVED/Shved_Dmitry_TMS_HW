package Lesson8_Task.task1;

public class Contact {

    private String contactName;
    private String contactNumber;

    public Contact(String contactName, String contactNumber) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    @Override
    public String toString() {
        return "Имя контакта: " + getContactName() + "| Номер контакта :" + getContactNumber();
    }
}
