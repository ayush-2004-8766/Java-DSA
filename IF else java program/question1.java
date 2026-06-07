//check number is odd or even

import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("enter a number = ");
        int n = sc.nextInt();
       sc.close();
        if(n%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    
}
