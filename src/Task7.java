import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a text : ");
        String text = scan.nextLine();
        text = text.trim();
        int sumWords = 0;
        int counterWords= 1;
        int sumBukwi = 0;
        int broqchBukwi= 0;
        for (int i = 0; i < text.length(); i++) {

            if(text.charAt(i) != ' '){
                broqchBukwi++;
                if(sumBukwi<=broqchBukwi){
                    sumBukwi=broqchBukwi;
                }
            }else{
                counterWords++;
                broqchBukwi=0;
                if(sumWords<counterWords){
                    sumWords=counterWords;
                }
            }
        }
        System.out.println("В текста има " + sumWords + " думи ,а най-дългата дума е съставена от " + sumBukwi + " символа.");
    }
}
