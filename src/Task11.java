public class Task11 {

    public static void main(String[] args) {
        int[] array = {5, 21, 145, 72, 1234, 234};
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
