import java.util.Scanner;
public class rotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n = sc.nextInt();
       
        int arr[] = new int[n];
        System.out.print("enter the element of array:");
        for(int i = 0; i<n;i++){
           arr[i] = sc.nextInt();
        }
        System.out.print("your array : ");
        for(int ele:arr ){
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.print("enter the number of rotation :");
        int e = sc.nextInt();
        e = e % n;
        reverse (0,n-1,arr);
        reverse(0,e-1,arr);
        reverse(e,n-1,arr);
        System.out.print("yor rotated array :");
        for(int ele:arr){
            System.out.print(ele+" ");
        } 
         sc.close();   
    }
    public static void reverse(int s,int e,int arr[]) {
        int n = arr.length;
        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }

      
        
    }
    
}
