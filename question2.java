//take any number and check it is multiple of 5 or not?
import java.util.Scanner;
public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number = ");
        int n = sc.nextInt();
        sc.close();
        if(n%5==0){
            System.out.println("It is multiple of 5");
        }
        else{
            System.out.println("it is not a multiple of 5");
        }
    }
    
}




