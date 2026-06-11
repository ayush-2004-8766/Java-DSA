
//given an array ,print negative element only?
import java.util.Scanner;
public class arrayQues1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("enter the array size = ");
       int n =sc.nextInt();
       int arr[] = new int[n];
       System.out.print("enter array element = ");
       for(int i=0;i<n;i++){
        arr[i] = sc.nextInt(); 
      }
      for(int i=0;i<n;i++){
        if(arr[i]<0)System.out.print("The negative value in this array is = "+arr[i]+" ");
      }
      sc.close();

    }
    
}
