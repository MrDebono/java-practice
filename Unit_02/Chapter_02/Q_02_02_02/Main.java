package Unit_02.Chapter_02.Q_02_02_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        if (name.equals("Argentina")) {
            System.out.println("Lionel Messi");
        } else if (name.equals("Portugal")){
            System.out.println("Cristiano Ronaldo");
        } else {
            System.out.println("no preference");
        }
        input.close();


        
    }
}
