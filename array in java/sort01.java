import java.util.Scanner;
public class sort01 {
    public static void swap(int i,int j,int arr[]) {
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j] = temp;  
    }
    public static void sort01(int arr[]) {
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            if( arr[i]==1){
                swap(i,j,arr);
                j--;
            }
            else if(arr[i]==0){
                i++;
            }
        } 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter the size of array:");
        int n =sc.nextInt();
        int arr[] = new int[n];

        System.out.print("enter the element of array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int ele:arr){
            System.out.print(ele);
        }
        System.out.println();

        sort01(arr);

        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
