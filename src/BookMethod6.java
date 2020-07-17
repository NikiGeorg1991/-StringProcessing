import java.util.Scanner;

public class BookMethod6  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int aSize;
        int bSize;
        int cSize;
        do {
            System.out.println("Enter a positive number for A size : ");
            aSize = scan.nextInt();
            System.out.println("Enter a positive number for B size : ");
            bSize = scan.nextInt();
            System.out.println("Enter a positive number for C size : ");
            cSize = scan.nextInt();
        }while(aSize<0 || bSize<0 || cSize<0);
        boolean answer = triangle(aSize,bSize,cSize);
        System.out.println(answer);

    }

    public static boolean triangle(int a, int b, int c){
        boolean isTriangle = true;
        boolean isNotTriangle = false;
        if((a+b>c)&&(a+c>b)&&(c+b>a)){
           return isTriangle;
        }else{
            return isNotTriangle;
        }
    }
}
