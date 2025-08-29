import java.util.Scanner;

class PrintMultiplesOfX {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter x");
        int x = s.nextInt();
        int n = 1;
        int limit = 1000;
        while(x * n <= limit){
            System.out.println(x * n);
            n++;
        }
    }
}
