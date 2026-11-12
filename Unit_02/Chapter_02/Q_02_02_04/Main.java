package Unit_02.Chapter_02.Q_02_02_04;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    int amount = 500;
    int withdrawal = 250;
    Scanner input = new Scanner(System.in);
    String pin = input.nextLine();

    if (pin.length() != 4) {
        System.out.println("Invalid PIN length entered. Goodbye.");
        input.close();
        // return;
    } else {
        System.out.println("New PIN stored.");

        
    }
    
    String pin2 = input.nextLine();
    if (pin2.length() != 4) {
        System.out.println("Invalid PIN length entered. Goodbye.");
        input.close();
    // return;
    } else if (!(pin2.equals(pin))) {
        System.out.println("Invalid PIN entered. Goodbye.");
        input.close();
    // return;
    }
    int money = Integer.parseInt(input.nextLine());

    if (money > amount) {
        System.out.println("Insufficient funds. Goodbye.");
        input.close();
        // return;
    } else if (money > withdrawal){
    System.out.println("Exceeds daily limit. Goodbye.");
    input.close();
    // return;
    } else {
        System.out.println("Withdrawal approved.");
        int balance = amount - money;
        System.out.println(String.format("Balance: $%s", balance));
    }
    input.close();
    // return;
    }
}