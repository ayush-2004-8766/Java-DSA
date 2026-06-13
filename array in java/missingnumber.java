import java.util.Scanner;
public class missingnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of array :");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("enter the element of array :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int ele:arr){
            System.out.print(ele+" ");
        }
        int sn = ((n+1)*(n+2))/2;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum+arr[i];
        }
        System.out.println();
        int mn = sn-sum;
        System.out.println(mn);
    }
    
}
