// print the second maximum element of the array?
public class secondMax {
    public static void main(String[] args) {
        int arr[]= {10,5,9,12,34,5,35,65,8};
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
        //max value
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        //second max
        for(int i=0;i<arr.length;i++){
            if(arr[i]>secmax && arr[i]!=max) secmax = arr[i];
        }
        System.out.println(max);
        System.out.println(secmax);

    }
    
}
