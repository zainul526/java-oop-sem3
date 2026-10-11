class University {
    String name = "Aligarh Muslim University";
    int ranking = 10;
}

class Faculty extends University {
    String name = "Faculty of Science";

    void Details() {
        System.out.println("Faculty Name: " + name);
    }
}

class Department extends Faculty {
    String name = "Department of Computer Science";
    String chairman = "Chairman Name";

    void Details() {
        System.out.println("Department Name: " + name);
        System.out.println("Chairman: " + chairman);
    }

    void Display() {
        super.Details();   // Faculty class ka Details()
        Details();         // Department class ka Details()
    }
}

public class q2 {
    public static void main(String[] args) {

        Department d = new Department();

        d.Display();

        System.out.println("University Ranking: " + d.ranking);
    }
}