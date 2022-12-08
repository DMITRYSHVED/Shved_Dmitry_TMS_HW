package Lesson8_Task.task1;

public class Phone {

    String number;
    final String model;
    double weight;
    Contact[] contacts = new Contact[100];

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void saveContact(Contact contact) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                if (contacts[i].getContactNumber().equals(contact.getContactNumber())) {
                    System.out.println("This number is already exists");
                    break;
                } else if (i == contacts.length - 1) {
                    System.out.println("Your telephone book is full");
                    break;
                }
            } else {
                contacts[i] = contact;
                break;
            }
        }
    }

    public void showContactsInfo() {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                System.out.println(contacts[i]);
            }
        }
    }

    public void receiveCall(Contact contact) {
        System.out.println("Звонит " + contact.getContactName() + " " + "<" + contact.getContactNumber() + ">");
    }

    public Contact receiveCall(String contactName, String contactNumber) {
        for (int i = 0; i < contacts.length; i++) {
            if (contactName.equals(contacts[i].getContactName()) && contactNumber.equals(contacts[i].getContactNumber())) {
                return contacts[i];
            }
        }
        return null;
    }

    public void sendMessage(String message, Contact... contacts) {
        System.out.println("Сообщение '" + message + "' отправлено на номера: ");
        for (int i = 0; i < contacts.length; i++) {
            System.out.println(contacts[i].getContactNumber());
        }
    }
}
