import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word till 15 symbols : ");
        String firstWord = scan.next();
        System.out.println("Enter a word till 15 symbols : ");
        String secondWord = scan.next();

        if (firstWord.length() == secondWord.length()) {
            System.out.println(" Двата низа са с равна дължина. ");
            for (int index = 0; index < secondWord.length(); index++) {
                if(firstWord.charAt(index) != secondWord.charAt(index)){
                    System.out.println("Има разлика в символ " + (index+1) + " , " +
                            firstWord.charAt(index) + " - " + secondWord.charAt(index));
                }
            }
        }
//        тук ми бие грешка, ако не са с еднаква дължина и ако условието във for е до по-голямата дума, защото вероятно
//        трябва да сравни нещо с нищо, има ли как да се избегне този момент?

//        if (firstWord.length() > secondWord.length()) {
//            System.out.println(" Първият низ е с по-голяма дължина. ");
//            for (int index = 0; index < secondWord.length(); index++) {
//                if(firstWord.charAt(index) != secondWord.charAt(index)){
//                    System.out.println("Има разлика в символ " + (index+1) + " , " +
//                            firstWord.charAt(index) + " - " + secondWord.charAt(index));
//                }
//            }
//        }

    }
}
