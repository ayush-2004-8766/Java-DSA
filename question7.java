// Take 3 positive integer input and tell if they can be the side of a triangle or not?
//a+b>c
import java.util.Scanner;
public class question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first side of triangle =");
        int a = sc.nextInt();
        System.out.print("enter the second side of triangle =");
        int b = sc.nextInt();
        System.out.print("enter the third side of a triangle =");
        int c = sc.nextInt();
        sc.close();
        if(a+b>c && c+b>a && c+a>b){
            System.out.println("these are the side of triangle");
        }
        else{
            System.out.println("these are not a side of triangle");
        }
    }
    
}
