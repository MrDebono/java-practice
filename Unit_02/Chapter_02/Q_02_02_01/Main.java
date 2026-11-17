package Unit_02.Chapter_02.Q_02_02_01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        int number = Integer.parseInt(scannerObj.nextLine()); 

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Fizz Buzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
         } else {
            System.out.println(number);
        } 
        scannerObj.close();
    } 
}  
