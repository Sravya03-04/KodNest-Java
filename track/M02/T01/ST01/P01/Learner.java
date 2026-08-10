import java.util.Scanner;

public class Learner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of days
        // Calculate the total and display the progress status
        int days = scanner.nextInt();
        int total = 0;
        for (int day = 1; day <= days; day++) {
            total += scanner.nextInt();
        }
        System.out.println("Total solved: " + total);
        if (total >= 20) {
            System.out.println("Status: " + "Strong progress");
        } else if (total >= 10 && total <= 19) {
            System.out.println("Status: " + "Keep improving");
        } else {
            System.out.println("Status: " + "Needs more practice");
        }
        scanner.close();
    }
}