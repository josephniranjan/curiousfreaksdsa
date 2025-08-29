import java.util.Scanner;

class PrintXWithYTimes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter x");
        int x = s.nextInt();
        System.out.println("Enter y");
        int y = s.nextInt();
          System.out.println("print x, y times");
        for(int i = 0; i < y; i++){
            System.out.println(x);
        }
    }
}