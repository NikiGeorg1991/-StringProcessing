public class BookMethod1 {
    public static void main(String[] args) {
        int[] masiv = {2,5,11,36,17,25,29,31,18};

        double array = srednoaritmetichno(masiv);
        System.out.println(array);
    }
    public static double srednoaritmetichno(int[] numbers){
        int sum =0;
        double sredno=0;
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i];
        }
        sredno=sum/numbers.length;
        return sredno;
    }
}
