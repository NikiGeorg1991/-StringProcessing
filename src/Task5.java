import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter word : ");
        String firstWord = scan.next();
        System.out.println("Enter word : ");
        String secondWord = scan.next();


        for (int i = 0; i < firstWord.length(); i++) {
            System.out.print(firstWord.charAt(i));
            if(firstWord.charAt(i)==secondWord.charAt(0)){
                System.out.print(secondWord.substring(1));
            }
            System.out.println();
        }


    }
}
