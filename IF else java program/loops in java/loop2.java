//print all even number from 1 to 100?
import java.util.Scanner;
public class loop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.print(i+ " ");
            }

        }
    }
    
}
