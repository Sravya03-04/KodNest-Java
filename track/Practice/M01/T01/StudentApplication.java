class Student33 {
    String name;
    int age;
    double height;

    void input(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}

public class StudentApplication {
    public static void main(String[] args) {
        Student33 s1 = new Student33();
        s1.input("Sravya", 21, 5.1);
        s1.display();
    }
}