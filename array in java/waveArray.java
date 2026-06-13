import java.util.Scanner;
public class waveArray {
    public static void wave(int arr[]) {
        for(int i=0;i<arr.length;i+=2){
            if(i==arr.length-1) break;
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("enter the element of array in increasing order:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int ele:arr){
            System.out.print(ele);
        }
        System.out.println();
        wave(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }


        
    }
    
    
}
