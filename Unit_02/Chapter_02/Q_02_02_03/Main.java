package Unit_02.Chapter_02.Q_02_02_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int percent = Integer.parseInt(input.nextLine());
        if (80 <= percent && percent <= 300) {
            System.out.println("healthy");
        } else if (60 <= percent && percent <= 79) {
            System.out.println("bloody nose");
        } else if (40 <= percent && percent <= 59) {
            System.out.println("face swollen");
        } else if (20 <= percent && percent <= 39) {
            System.out.println("eyes bloodshot, face bleeding");
        } else if (1 <= percent && percent <= 19) {
            System.out.println("even more blood");
        } else if (0 == percent) {
            System.out.println("eyes closed. Game Over");
        }
    }
}