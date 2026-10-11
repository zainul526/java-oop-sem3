// 1. Create a class Vehicle, write a method cost() in this class. Create two classes Bus and Train which
// have their own display() methods and inherit from Vehicle class. Create objects of Bus and Train
// class and call cost() and display() methods.

class Vehicle{
    void cost(){
        System.out.println("Cost is 100 rupees");
    }
}

class Bus extends Vehicle{
    void displayBus(){
        System.out.println("Method of Bus Class");
    }
}

class Train extends Vehicle{
    void displayTrain(){
        System.out.println("Method of Train Class");
    }
}

public class q1{
    public static void main(String[] args) {
        Bus b = new Bus();
        b.cost();
        b.displayBus();

        Train t = new Train();
        t.cost();
        t.displayTrain();
    }
}