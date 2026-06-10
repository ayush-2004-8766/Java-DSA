
import java.util.Scanner;
public class numberSquare {
    
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows for square = ");
        int row = sc.nextInt();
        sc.close();
        for(int i=1; i<=row; i++){
            for(int j=1; j<=row; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    
    
}
}
