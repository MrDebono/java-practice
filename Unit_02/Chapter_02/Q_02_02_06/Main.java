package Unit_02.Chapter_02.Q_02_02_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    long money = Long.parseLong(input.nextLine());
    if (money <= 58523){
        System.out.println("1");
    } else if (58523 < money && money <= 117045) {
        System.out.println("2");
    } else if (117045 < money && money <= 181440) {
        System.out.println("3");
    } else if (181440 < money && money <= 258482) {
        System.out.println("4");
    } else if (258482 < money) {
        System.out.println("5");
    } 
    
    
    }
}