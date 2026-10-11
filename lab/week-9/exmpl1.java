// Create a class Person having data members name and age and a method display().
// Create a class Employee that inherits Person and has data members employeeId and salary. Override the display() method to display employee details.
// Create another class Manager that inherits Employee and has a data member department. Override display() again.
// Create an object of Manager and display all Person, Employee and Manager details.

class Person{
    String name ="ABC";
    int age=20;

    void display(){
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
    }
}
class Employee extends Person{
    int empId = 876;
    int sal = 9870;

    void display(){
        super.display();
        System.out.println("Employee Id is"+empId);
        System.out.println("Salary is"+sal);
    }
}
class Manager extends Employee{
    String Dept = "Tech";
    
    void display(){
        super.display();
        System.out.println("Department of Manager is "+Dept);
    }
}

public class exmpl1 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.display();
    }
    
}
