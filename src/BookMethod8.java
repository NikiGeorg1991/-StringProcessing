public class BookMethod8 {
    public static void main(String[] args) {

        deliNaPet();
    }

    public static void deliNaPet() {

        for (int i = 0; i <= 100; i += 5) {
            if (i == 100) {
                System.out.print(i);
            } else {
                System.out.print(i + " , ");
            }
        }
    }
}
