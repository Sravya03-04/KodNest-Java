import java.util.Scanner;

class Learner {
    int id;
    String name;
    int javaScore;
}

public class Main12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Learner s1 = new Learner();
        s1.id = scanner.nextInt();
        s1.name = scanner.next();
        s1.javaScore = scanner.nextInt();

        Learner s2 = new Learner();
        s2.id = scanner.nextInt();
        s2.name = scanner.next();
        s2.javaScore = scanner.nextInt();

        int newJavaScore = scanner.nextInt();

        System.out.println("Before Update");
        System.out.println(s1.id + " " + s1.name + " " + s1.javaScore);
        System.out.println(s2.id + " " + s2.name + " " + s2.javaScore);

        s1.javaScore = newJavaScore;

        System.out.println("After Update");
        System.out.println(s1.id + " " + s1.name + " " + s1.javaScore);
        System.out.println(s2.id + " " + s2.name + " " + s2.javaScore);

        scanner.close();
    }
}