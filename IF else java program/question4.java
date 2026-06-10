//take real number input and check if it is an integer or not ?
import java.util.Scanner;
public class question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number = ");
        double n = sc.nextDouble();
        sc.close();
        int x = (int)n;
        if(n-x>0){
            System.out.println("number is not an integer ");

        }
        else{
            System.out.println("number is an integer");
        }


    }
    
}
