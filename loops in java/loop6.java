// print this series 99,95,91,87......upto all term which are positive?
import java.util.Scanner;
public class loop6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        for(int i=99;i>0;i=i-4){
            System.out.print(i+" ");
        }
        
    }
    
}
