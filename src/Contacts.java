import java.util.ArrayList;
import java.util.Scanner;

public class Contacts extends InterfaceAbstractClass {

    private final ArrayList<String> names;
    private final ArrayList<Integer> numbers;

    public Contacts(ArrayList<String> names, ArrayList<Integer> numbers) {
        this.names = names;
        this.numbers = numbers;
    }

    @Override
    public void menu(){
        System.out.println("1. Manage contacts\n\t1. Show all contacts\n\t2. Add a new contact\n\t3. Search for contact\n\t4. Delete a contact\n\t5. Go back to previous menu");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        switch (input){
            case 1:
                System.out.println("Printing list of all contacts: ");
                for (int i  = 0; i < this.names.size(); i++){
                    System.out.println(this.names.get(i) + ": " + this.numbers.get(i));
                }
                menu();
            case 2:
                scanner.nextLine();
                scanner.nextLine();
                System.out.println("Input first your contact name");
                this.names.add(scanner.nextLine());
                System.out.println("now input the number of your contact");
                this.numbers.add(scanner.nextInt());
                System.out.println("Contact has been successfully created");
                menu();
            case 3:
                scanner.nextLine();
                System.out.println("Enter name of contact you want to search");
                String search = scanner.nextLine();
                if(names.contains(search)){
                    int index = names.indexOf(search);
                    System.out.println("Number of contact " + search + ": " + this.numbers.get(index));
                }
                else{
                    System.out.println("Contact with this name doesn't exist");
                }
                menu();
            case 4:
                scanner.nextLine();
                System.out.println("Enter name of contact you want to delete");
                String del = scanner.nextLine();
                if(names.contains(del)){
                    int index = names.indexOf(del);
                    names.remove(del);
                    numbers.remove(index);
                    System.out.println("Contact deleted successfully!");
                }
                else{
                    System.out.println("Contact with this name doesn't exist");
                }
                menu();
            default:
                break;
        }
    }
}
