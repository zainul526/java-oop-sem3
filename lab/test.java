class Student {

    String name;
    int age;
    String course;

    // 0 argument constructor
    Student() {
        this("Unknown");
        System.out.println("0 argument constructor");
    }

    // 1 argument constructor
    Student(String name) {
        this(name, 0);
        System.out.println("1 argument constructor");
    }

    // 2 argument constructor
    Student(String name, int age) {
        this(name, age, "Bsc");
        System.out.println("2 argument constructor");
    }

    // 3 argument constructor
    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;

        System.out.println("3 argument constructor");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.display();
    }
}