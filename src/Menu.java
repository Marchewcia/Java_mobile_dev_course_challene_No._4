import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Messages msg;
    Contacts cnt;
    public Menu() {
        ArrayList<String> temp = new ArrayList<>();
        temp.add("New package");
        temp.add("Remember to buy milk");

        ArrayList<String> temp2 = new ArrayList<>();
        temp2.add("Impost");
        temp2.add("Mom");

        this.msg = new Messages(temp, temp2);

        ArrayList<String> temp3 = new ArrayList<>();
        temp3.add("Mom");
        temp3.add("Dad");
        temp3.add("Sister");

        ArrayList<Integer> temp4 = new ArrayList<>();
        temp4.add(123456789);
        temp4.add(987654321);
        temp4.add(567239534);

        this.cnt = new Contacts(temp3, temp4);
    }

    public boolean menu(){
        System.out.println("Contact app menu:\n\t1. Manage contacts\n\t2. Messages\n\t3. Quit");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        switch (input){
            case 1:
                cnt.menu();
                return true;
            case 2:
                msg.menu();
                return true;
            default:
                return false;
        }
    }

}
