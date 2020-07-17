import java.util.Scanner;

public class BookMethod7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arrSize;
        do {
            System.out.println("Enter a positive number for array size : ");
            arrSize = scan.nextInt();
        }while(arrSize<1);
        int[] array1 = new int [arrSize];
        for (int i = 0; i <arrSize ; i++) {
            System.out.println("Enter value of " + i + " element in array1 : ");
            array1[i]=scan.nextInt();
        }

    }
//    public static int countedNumbers(char[] array){
//
//    }
}
