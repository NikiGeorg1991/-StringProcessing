import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Въведете текст: ");
        String text = scan.nextLine();
        String formatedText = "";
        char changedText;

        for (int i = 0; i < text.length(); i++) {
            changedText = (char) (text.charAt(i) + 5);
            formatedText = formatedText.concat(String.valueOf(changedText));
        }
        System.out.print(formatedText);
    }
}
