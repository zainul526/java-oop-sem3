public class q11 {
    //print num from 1 to 99
    public static void main(String [] args){
        int i=1;
        while(i<100){
            if(i%2!=0){
                if(i!=99)
                {System.out.print(i+", ");}
                else 
                    System.out.print(i);
            }
        }
    }
}
