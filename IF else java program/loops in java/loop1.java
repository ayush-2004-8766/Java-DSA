//print "ayush" n times . Take n input from us
import java.util.Scanner;
public class loop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("give value in int how many time you want to print your name = ");
        int n = sc.nextInt();
        sc.close();
        int i;
        for(i=1;i<=n;i++){
            System.out.println("Ayush mishra");
        }
    }
    
}
