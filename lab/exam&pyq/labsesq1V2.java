public class labsesq1V2 {
    public static void main(String[] ibt) {
        int[] ar = { 4, 6, 23, 84, 45 };
        int big = ar[0];
        int big2 = ar[1];
        for (int i = 1; i < 5; i++) {
            if (i == 1) {
                if (ar[i - 1] > ar[i]) {
                    big = ar[i - 1];
                    big2 = ar[i];
                } else {
                    big2 = ar[i - 1];
                    big = ar[i];
                }
            } else {
                if ((ar[i] > big2) && (ar[i] < big)) {
                    big2 = ar[i];
                } else if (ar[i] > big) {
                    big2 = big;
                    big = ar[i];
                } else {
                    continue;
                }
            }
        }
        System.out.println(big2);
    }
}