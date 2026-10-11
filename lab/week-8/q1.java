// Create a class FRUIT which has data members color, taste and price. Also create a method display() which will print
// values of FRUIT object. Create three objects of FRUIT class and call their display() methods
class FRUIT{
    String color;
    String taste;
    int price;
    void display(){
        System.out.println("Color is "+color);
        System.out.println("Taste is "+taste);
        System.out.println("Price is "+price);
    }
}

public class q1 {
    public static void main(String[] args) {
        FRUIT f1 = new FRUIT();
        f1.color = "White";
        f1.taste = "Taste1";
        f1.price = 277;
        f1.display();

        FRUIT f2 = new FRUIT();
        f2.color = "White22";
        f2.taste = "Taste22";
        f2.price = 27722;
        f2.display();
        FRUIT f3 = new FRUIT();
         f3.color = "White33";
        f3.taste = "Taste33";
        f3.price = 2772233;
        f3.display();

    }
}
