import java.util.Scanner;

public class BookMethod3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arrSize;
        do {
            System.out.println("Enter array size : ");
            arrSize = scan.nextInt();
        }while(arrSize<1);

        int[] array = new int [arrSize];
        for (int i = 0; i <arrSize ; i++) {
            System.out.println("Enter value of " + i + " element : ");
            array[i]=scan.nextInt();
        }

        otpechataiMasiv(array);
    }
    public static void otpechataiMasiv(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i] + "]");
                break;
            }
            System.out.print(array[i] + " , ");
        }
    }
}