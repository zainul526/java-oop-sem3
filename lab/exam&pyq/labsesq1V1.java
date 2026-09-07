public class labsesq1V1 {
    public static void main(String[] ibt){
        int [] ar = {4,6,23,84,45};
        int big =ar[0];
        int big2 = ar[1];
        for(int i=0; i<5; i++){
            if(ar[i]>big){
                big=ar[i];
            }
        }
        for(int j=0; j<5; j++){
            if(ar[j]>big2){
                if(ar[j]==big)
                    continue;
                }
                big2=ar[j];
        }
        System.out.println(big2);
    }
    
}
