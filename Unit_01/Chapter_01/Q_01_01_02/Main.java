package Unit_01.Chapter_01.Q_01_01_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length = Double.parseDouble(input.nextLine());
        double width = Double.parseDouble(input.nextLine());
        double area = length * width;
        System.out.println(area);
    }
}
