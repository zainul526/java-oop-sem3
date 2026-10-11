// Create a class FRUIT which has data members color, taste and price. It has a method setDetails() which will set the
// values of color, taste and price. Also create a method display() which will print values of FRUIT object.
class FRUIT{
    private String color;
    private String taste;
    private int price;
    void setDetails(String color, String taste, int price){
        this.color = color;
        this.taste = taste;
        this.price = price;
    }
    void display(){
        System.out.println("Color is "+color);
        System.out.println("Taste is "+taste);
        System.out.println("Price is "+price);
    }
}

public class q2 {
    public static void main(String[] args) {
        FRUIT f1 = new FRUIT();
        f1.setDetails("White", "taste1",100);
        f1.display();
        
        FRUIT f2 = new FRUIT();
        f2.setDetails("White22", "taste122",10022);
        f2.display();
        FRUIT f3 = new FRUIT();
        f3.setDetails("White2233", "taste12233",1002233);
        f3.display();

    }
}
