//take integer input and print the absolute value of that integer?
import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number = ");
        int n = sc.nextInt();
        sc.close();
        if(n>=0){
            System.out.println(n);
        }
        else{
            System.out.println(-n);
        }
    }
    
}
