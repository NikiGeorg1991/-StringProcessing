import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String firstWord ;
        String secondWord ;

        do {
            System.out.println("Enter a words till 40 symbols : ");
            firstWord = scan.next();
            secondWord = scan.next();
        }while(firstWord.length()>40 && secondWord.length()>40);

        System.out.print(firstWord.toUpperCase() + " " + firstWord.toLowerCase() + " " +
                secondWord.toUpperCase() + " " + secondWord.toLowerCase());
    }
}
