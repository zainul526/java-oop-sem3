public class TheoSes1 {
    //print pattern
    //     1
    //   2 * 2
    //  3 * * * 3
    // 4 * * * * * 4
public static void main(String[] args) {
    int N =3;
    for(int i =1; i<=N; i++){
        for(int spc=1; spc<=N-i; spc++){
            System.out.print(" ");
        }
        for(int j=1; j<=i;j++){
            if(j==1|j==i){
                System.out.print(i+" ");
            }
            else 
                System.out.print("*"+" ");
        }

        System.out.println();
    }
}
}
