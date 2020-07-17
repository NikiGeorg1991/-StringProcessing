import java.util.Scanner;

public class TrainingMode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstWord;
        int secondWord;
        do {
            System.out.println("Enter a words till 40 symbols : ");
            firstWord = scan.nextInt();

        } while (firstWord < 1000 || firstWord > 99999);
        System.out.println(firstWord);
        boolean isPalindrom = true;
    }
}