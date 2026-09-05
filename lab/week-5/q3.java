public class q3 {
//     //Write a java program to print the following pattern.
// 1
// 12
// 123
// 1234
// 12345
    
    public static void main(String[] args) {

        int count = 5;

        for (int i = 1; i <= count; i++) {

            for (int space = 1; space <= count - i; space++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
