// merge two sorted array in a singel big array?
import java.util.Scanner;
public class merge2ShorthdArray {

    public static void merge(int c[], int a[], int b[]) {
        int i = 0, j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k] = a[i];
                i++;
                k++;
            }
            else{
                c[k] = b[j];
                j++;
                k++;
            }
            if(i==a.length){
                while(j<b.length){
                    c[k++] = b[j++];
                }
            }
            if(j==b.length){
                while(i<a.length){
                    c[k++] = a[i++];
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1st array input
        System.out.print("enter the size of array:");
        int a = sc.nextInt();
        int arr[] = new int[a];

        System.out.print("enter the element of array in shorthe order:");
        for(int i =0;i<a;i++){
            arr[i] = sc.nextInt();
        }
          //2nd array input 
        System.out.print("enter the size of array:");
        int b = sc.nextInt();
        int rr[] = new int[b];

        System.out.print("enter the element of array in shorthe order:");
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int c[] = new int[arr.length+rr.length];
        for(int ele:c){
            System.out.print(ele+"");
        }
        System.out.println();
        merge(c,arr,rr);
        for(int ele:c){
            System.out.print(ele+" ");
        }
        sc.close();

        
    }
    
}
