import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String firstWord;
        String secondWord;
        do {
            System.out.println("Enter a word till 15 symbols : ");
            firstWord = scan.next();
            System.out.println("Enter a word till 15 symbols : ");
            secondWord = scan.next();
        } while ((firstWord.length() > 15) || (secondWord.length() > 15));
        if (firstWord.length() >= secondWord.length()) {
            System.out.println(firstWord.length() +  " " +secondWord.substring(0,5) + firstWord.substring(5));
        }
        else  {
            System.out.println(secondWord.length() +  " " +firstWord.substring(0,5) + secondWord.substring(5));
        }
    }
}

