import java.util.Scanner;
public class inputOutputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
   // output ke liya
   // int arr[] = {2,4,56,98,35,69};
       // for(int i=0;i<arr.length;i++){
           // System.out.print(arr[i]+" ");
      //  }
      
      //input
      int arr[] = new int[7];
      for(int i = 0; i<=6; i++){
        arr[i] = sc.nextInt();
        }
        //output
      for(int i=0;i<=6;i++){
        System.out.print(2*arr[i]+" ");
      }
    sc.close();
    }
}

