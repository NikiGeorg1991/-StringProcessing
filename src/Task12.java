import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Въведете число N : ");
        int numberN = scan.nextInt();
        while (numberN < 1) {
            System.out.println("Въведете число N по-голямо от 1");
        }
        int[] array = masivN(numberN);

    }

    public static int[] masivN(int numberN) {
        int[] masiv = new int[numberN];
        System.out.print("[");
        for (int i = 0; i < masiv.length; i++) {
            if (i == masiv.length - 1) {
                masiv[i] = i + 1;
                System.out.print(masiv[i] + "]");
                break;
            }
            masiv[i] = i + 1;
            System.out.print(masiv[i] + " , ");
        }
        return masiv;
    }
}
