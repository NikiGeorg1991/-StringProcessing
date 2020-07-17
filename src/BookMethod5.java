import java.util.Scanner;

public class BookMethod5 {
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
        int[] array2 = new int[arrSize];
        for (int i = 0; i <arrSize ; i++) {
            System.out.println("Enter value of " + i + " element in array2 : ");
            array2[i] = scan.nextInt();
        }
        int[] arrayResult = arrayMultiplication(array1,array2);

        System.out.print("[");
        for (int i = 0; i < arrayResult.length; i++) {
            if (i == arrayResult.length - 1) {
                System.out.print(arrayResult[i] + "]");
                break;
            }
            System.out.print(arrayResult[i] + " , ");
        }

    }
    public static int[] arrayMultiplication(int[] firstArr, int[] secondArr){
        int[] arrayMulti = new int[firstArr.length];
        for (int i = 0; i < firstArr.length; i++) {
            arrayMulti[i]= firstArr[i]*secondArr[i];
        }
        return arrayMulti;
    }
}
