import java.util.Arrays;
public class arrayques5 {
    public static void main(String[] args) {
        int arr[]={4,5,6,2,-6,-4,65};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    
}