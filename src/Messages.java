import java.util.ArrayList;
import java.util.Scanner;

public class Messages extends InterfaceAbstractClass {
    private ArrayList<String> messages = new ArrayList<>();
    private ArrayList<String> contacts = new ArrayList<>();

    public Messages(ArrayList<String> messages, ArrayList<String> contacts) {
        this.messages = messages;
        this.contacts = contacts;
    }

    @Override
    public void menu(){
        System.out.println("2.Messages:\n\t1. See the list of all messages\n\t2. Send a new message\n\t3. Go back to previous menu");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        switch (input){
            case 1:
                System.out.println("Printing list of all messages: ");
                for (int i  = 0; i < this.messages.size(); i++){
                    System.out.println(this.contacts.get(i) + ": " + this.messages.get(i));
                }
                break;
            case 2:
                System.out.println("Input first your contact name");
                this.contacts.add(scanner.nextLine());
                System.out.println("And now your new message that you want to send");
                this.messages.add(scanner.nextLine());
                System.out.println("Message has been successfully send");
                break;
            default:
                break;
        }
    }
}
