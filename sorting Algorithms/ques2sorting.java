
// bubble sort
public class ques2sorting {
    public static void print(int arr[]) {
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {2,6,4,1,3,8,7,9,5};
        int n = arr.length;
        print(arr);
        System.out.println();
        for(int i = 0; i<n-1;i++){
            for(int j=0;j<n-1;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        }
        print(arr);
    }
    
}
