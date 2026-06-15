//take a positive integer input and print ?
//if number is divisible by 5;
//if number is divisible by 3;
//if the number is divisible by both 3 & 5;
//if number is not divisible by 5 & 3;
import java.util.Scanner;
public class question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number :"); 
        int x = sc.nextInt();
        sc.close();
        if(x%5==0){
            System.out.println("the number is divisible by 5");
        }
        if(x%3==0){
            System.out.println("the number is multiple of 3");
        }
        if (x%5==0 && x%3==0){
            System.out.println("the number is divisible by both 3 & 5");
        }
        else if(x%5!=0 && x%3!=0){
            System.out.println("the number is not divisible by 3 & 5");
        }
        
    }
    
}
