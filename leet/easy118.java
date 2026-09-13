public class easy118 {
    // print Pascal's triangle pattern
    static void ptrn(int line) {

        for (int i = 1; i <= line; i++) {

            int j = 1;
            int crnt = 1;

            while (j <= i) {

                System.out.print(crnt + " ");

                crnt = crnt * (i - j) / j;

                j++;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num = 5;
        ptrn(num);
    }
}