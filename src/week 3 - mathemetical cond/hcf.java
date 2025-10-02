// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int a = 6;
        int b = 8;
        int min = Math.min(a,b);
        int hcf = 0;
        for(int i = 1; i < min; i++){
            if(min % i == 0){
                hcf = i;
            }
        }
         System.out.println(hcf);
    }
}