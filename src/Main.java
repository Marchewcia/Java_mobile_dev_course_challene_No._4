import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
        Menu menu = new Menu();
        boolean program = true;
        while(program){
            program = menu.menu();
        }
    }
}
