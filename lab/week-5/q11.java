public class q11 {
    //11. Write a Java program to print the following pattern:
//   *
//  * *
// * * *
//  * *
//   *
public static void main(String[] args){
    int count = 3;
 //upper pattern
    for(int i=1; i<=count; i++){
        for(int spc=1; spc <= count-i; spc++){
            System.out.print(" ");
        }
        for(int j =1; j<=i; j++){
            System.err.print("* ");
        }
        System.out.println();
    }

    //lower 

   for(int i=count-1; i>=1; i--){
        for(int spc=1; spc <= count-i; spc++){
            System.out.print(" ");
        }
        for(int j =1; j<=i; j++){
            System.err.print("* ");
        }
        System.out.println();
    }
        
    }
}

