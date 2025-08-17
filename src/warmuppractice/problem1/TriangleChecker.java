package warmuppractice.problem1;

import java.util.Scanner;

public class TriangleChecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input 3 angles
        System.out.print("Enter angle 1: ");
        int angle1 = s.nextInt();

        System.out.print("Enter angle 2: ");
        int angle2 = s.nextInt();

        System.out.print("Enter angle 3: ");
        int angle3 = s.nextInt();

        if (angle1 > 0 && angle2 > 0 && angle3 > 0 && (angle1 + angle2 + angle3 == 180)) {
            System.out.println("triangle can be formed.");
        } else {
            System.out.println("triangle cannot be formed.");
        }

        s.close();
    }
}
