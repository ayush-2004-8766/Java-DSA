//WAP to check if a given number is composite or not?
import java.util.Scanner;
public class loop9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number = ");
        int n = sc.nextInt();
        sc.close();
        boolean flag = false;
        
            if(n<= 1){
                System.out.println("it is neither a prime number nor a composite number");
            }
            else{
                for( int i=2; i<=n/2; i++);{
                    if(n % n == 0){
                        flag = true;
                        
                    }
            }
            if(flag){
                System.out.println(n + "it is a prime number");
            }
            else{
                System.out.println(n + "it is a prime number");
            }
        }

        
    }
    
}
