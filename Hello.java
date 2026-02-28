// string concatenation
import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n1;
        String n2;
        System.out.print("enter n1:");
         n1=sc.next();
        System.out.print("enter n2:");
       
        n2=sc.next();
        System.out.println("together:"+n1.concat(n2));
        System.out.println("done");
    }
    
}
