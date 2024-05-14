import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Messages msg;
    public Menu() {
        ArrayList<String> temp = new ArrayList<>();
        temp.add("New package");
        temp.add("Remember to buy milk");
        ArrayList<String> temp2 = new ArrayList<>();
        temp2.add("Impost");
        temp2.add("Mom");
        this.msg = new Messages(temp, temp2);
    }

    public boolean menu(){
        System.out.println("Contact app menu:\n\t1. Manage contacts\n\t2. Messages\n\t3. Quit");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        switch (input){
            case 1:
                return true;
            case 2:
                msg.menu();
                return true;
            default:
                return false;
        }
    }

}
