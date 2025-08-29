import java.util.Scanner;

class PrintName {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter firstName");
        String firstName = s.nextLine();
        System.out.println("Enter lastName");
        String lastName = s.nextLine();
        System.out.println("Number of times to print the name");
        int n = s.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println(firstName + lastName);
        }
    }
}
