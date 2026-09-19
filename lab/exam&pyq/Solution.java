public class Solution {
   
    public static void main(String[] args) {
        for(int i =1; i<=4;i++){
            for(int j=1; j<=4;j++){
                
                for(int k = 1; k<=4; k++){
                    
                    for(int l=1; l<=4; l++){
                        if (i != j && i != k && i != l &&
                            j != k && j != l &&
                            k != l) {
                        System.out.print(""+i+j+k+l+"  ");
                    }}
                }
            }
        }
    }
}