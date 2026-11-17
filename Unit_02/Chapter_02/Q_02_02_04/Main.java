package Unit_02.Chapter_02.Q_02_02_04;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scannerObj = new Scanner(System.in);
        String newPin = scannerObj.nextLine();
        int money = 500;
        int withDraw = 250;
        
        if (newPin.length() != 4){ 
            System.out.println("Invalid PIN length entered. Goodbye.");
            return;
        } else if (newPin.length() == 4){
            System.out.println("New PIN stored.");
        } else {
            System.out.println (); 
        }

        String savedPin = newPin;
        String userInput = scannerObj.nextLine();


        if (savedPin.length() != 4){
            System.out.println("Invalid PIN length entered. Goodbye.");
        } else if (!userInput.equals(savedPin)){
            System.out.println("Invalid PIN entered. Goodbye.");
        } else {
            int withdrawAmount = scannerObj.nextInt(); 
        
        
        if (withdrawAmount >= money ){
            System.out.println("Insufficient funds. Goodbye.");
        } else if (withdrawAmount >= withDraw){
            System.out.println("Exceeds daily limit. Goodbye.");
        } else {
            System.out.println("Withdrawal approved.");
            money -= withdrawAmount;
            System.out.println("Balance: $" + money);
        }
    
        
    

        
    } scannerObj.close();
}
}
