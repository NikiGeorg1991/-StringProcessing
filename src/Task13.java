

public class Task13 {
    public static void main(String[] args) {

        int[] firstArr = {2,2,2,2};
        int[] secondArr = {3,3,3,3,3,3,3};
        int[] masiv=finalMasiv(firstArr,secondArr);

        System.out.print("[");
        for (int i = 0; i < masiv.length; i++) {
            if (i == masiv.length - 1) {
                System.out.print(masiv[i] + "]");
                break;
            }
            System.out.print(masiv[i] + " , ");
        }
    }

    public static int[] finalMasiv(int[] firstArr , int[] secondArr){
        int[] masiv = new int[firstArr.length + secondArr.length];
        for (int i = 0; i < firstArr.length; i++) {
            masiv[i]=firstArr[i];
        }
        for (int i = 0; i < secondArr.length; i++) {
            masiv[firstArr.length+i]=secondArr[i];
        }

        return masiv;

    }
}
