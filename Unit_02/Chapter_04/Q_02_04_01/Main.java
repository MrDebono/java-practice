package Unit_02.Chapter_04.Q_02_04_01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scannerObj = new Scanner(System.in); 

    while (true) {
        String nameS = scannerObj.nextLine();

        if (nameS.equals("A girl has no name")){
            System.out.println("*sweats profusely*");
            break;
        }

    System.out.println("hello " + nameS + "!");
    System.out.println("NEXT!");
    }
    scannerObj.close();
    } 

}