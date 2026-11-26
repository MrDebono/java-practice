package Unit_02.Chapter_03.Q_02_03_02;
java.util.scanner();

public class Main {
    public static void main(String[] args) {
    Scanner input = new scanner(System.in);
    
    String s = input.nextLine().toLowerCase();

    int rCount = 0;
    int sCount = 0;
    int tCount = 0;
    int lCount = 0;
    int nCount = 0;
    int eCount = 0;

    for (int i = 0; i < s.length(); i++) {
        String letter = s.substring(i, i + 1);
     if (letter.equals("r")){ 
        rCount++;
     } else if (letter.equals("s"));
        sCount++;

    }
    input.close();
    }
}