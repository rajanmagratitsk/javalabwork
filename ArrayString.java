
import java.util.Scanner;
public class ArrayString {
    public static void main(String[] args) {
        String [] names=new String[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<names.length;i++){
            System.out.print("enter name:");
            names[i]=sc.next();
        }for(int i=0;i<names.length;i++){
        System.out.println(names[i]);
        }
    }
}
