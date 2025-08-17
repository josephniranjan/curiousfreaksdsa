package warmuppractice.problem1;
import java.util.*;

public class UserInputs {
	  /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
    int age = s.nextInt();
    char gender = s.next().charAt(0);
    double weight = s.nextDouble();
    s.nextLine();
    String name = s.nextLine();
    
    System.out.println(age);
    System.out.println(gender);
    System.out.println(weight);
    System.out.println(name);
      
    s.close();
  }
}
