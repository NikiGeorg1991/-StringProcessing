import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Въведете текст с разстояние между думите : ");
        String text = scan.nextLine();

        text = text.trim();
        text = text.substring(0, 1).toUpperCase() + text.substring(1).toLowerCase();

        for (int index = 0; index < text.length(); index++) {
            if (text.charAt(index) == ' ') {
                text =  text.substring(0, index + 1) +
                        text.substring(index + 1, index + 2).toUpperCase() +
                        text.substring(index + 2);
            }
        }
        System.out.println(text);
    }
}


