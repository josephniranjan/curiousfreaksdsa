// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int a = 14;
        int b = 8;
        int max = Math.max(a,b);
        int lcm = 0;
        int i = max;
       while(true){
            if(i % a == 0 && i % b == 0){
                lcm = i;
                break;
            }
            i++;
        }
         System.out.println(lcm);
    }
}