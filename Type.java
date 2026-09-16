import java.util.Scanner;

public class Type {
    public static void main(String[] args) {
  
        int a = 9;
        short b = 22;
        float c = 22.22f;
        double d = 3.123d;
        long f = 123L;
        char g = 'A';
        String st = "Hi there";
        
        d = f;       // Implicit casting 
        a = (int) f; // Explicit casting 
        
        System.out.println(a + " " + b + " " + c + " " + d + " " + f + " " + g + " " + st + " " + d);
    
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer for a1: ");
        int a1 = sc.nextInt();
        
        System.out.print("Enter a decimal number for d1: ");
        double d1 = sc.nextDouble(); 
        
        System.out.print("Enter text for c1: ");
        String c1 = sc.next();       
        
        System.out.println(" The value of the a1 " + a1);
        System.out.println(" The value of the c1 " + c1);
        System.out.println(" The value of the d1 " + d1);
        sc.close();
    }
}
