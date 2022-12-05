import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact (Contact contact){
        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact is already on file");
            return false;
        }else{
            myContacts.add(contact);
            return true;
        }
    }

    public boolean updateContact (Contact oldContect, Contact newContact){
        int position = findContact(oldContect);
        if(position >= 0){
            this.myContacts.set(position,newContact);
            System.out.println(oldContect.getName() + ", was replaced " + newContact.getName());
            return true;
        }else{
            System.out.println(oldContect.getName() + " was not found.");
            return false;
        }
    }

    public boolean removeContact ( Contact contact){
        int foundPosition = findContact(contact);
        if(foundPosition<0){
            System.out.println(contact.getName() + ", was not found.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName()+ " , was deleted.");
        return true;

    }

    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }
    private int findContact(String contactName ){
        for(int i=0; i<this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact){
        if(findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }
    public Contact queryContact(String name){
        int position = findContact(name);
        if(position >= 0){
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i=0; i<this.myContacts.size(); i++){
            System.out.println((i+1) + ". "
                    + this.myContacts.get(i).getName()
                    + " -> "
                    + this.myContacts.get(i).getPhoneNumber());
        }
    }


}