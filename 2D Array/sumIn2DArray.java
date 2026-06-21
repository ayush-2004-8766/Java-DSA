// sum of element in 2D array?
import java.util.Scanner;
public class sumIn2DArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the element of array:");
        int arr[][] = new int[3][4];
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }      
        }
       
        int sum = 0;
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr[0].length;j++){
               sum = sum+arr[i][j];

            }
           
        }
        System.out.println(sum);
        sc.nextInt();
    }
     
}