
// take input of array and print the sum of array?
import java.util.Scanner;
public class arrayQues2 {
     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("enter the size of array = ");
       int n = sc.nextInt();
       int arr[] = new int[n];
       System.out.print("enter the element of array =");
        int sum = 0;
       for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
        sum = sum+arr[i];
       }
        System.out.println(sum+" ");
       sc.close();
    //    int sum = 0;
    //    for(int i=0; i<n; i++){
    //    sum = sum + arr[i];
    //    System.out.print(sum+" ");
    //    }
     }
}
