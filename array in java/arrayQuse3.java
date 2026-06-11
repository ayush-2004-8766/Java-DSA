//take input and print product of array?

import java.util.Scanner;

public class arrayQuse3 {
      public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("enter the length of array = ");
       int n = sc.nextInt();
       int arr[] = new int[n];
       System.out.print("enter the element of array = ");
       int product = 1;
       for(int i = 0; i<n; i++){
        arr[i] = sc.nextInt();
        product = product*arr[i];
       }
       System.out.println("The product of array is = "+product);
       sc.close();
      }
}
