import java.util.Scanner;

public class Contacts extends InterfaceAbstractClass {

    @Override
    public boolean menu(){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        switch (input){
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return true;
            default:
                return true;
        }
    }
}
