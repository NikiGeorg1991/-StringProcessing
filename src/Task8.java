import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a text : ");
        String text = scan.next();
        boolean isPolinom = true;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i)!=text.charAt(text.length()-1-i)){
                isPolinom=false;
            }
        }
        System.out.println(isPolinom ? "Думата е полином" : "НЕ е полином");
    }
}
