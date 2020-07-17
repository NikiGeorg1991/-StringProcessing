import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter positive number : ");
            number = scan.nextInt();
        } while (number < 1);
        int factorial = factorialN(number);
        System.out.println(factorial);
    }

    public static int factorialN(int numberN) {
        int sum =1;
        for (int i = numberN; i > 1; i--) {
            sum=sum*i;
        }
        return sum;
    }
}
