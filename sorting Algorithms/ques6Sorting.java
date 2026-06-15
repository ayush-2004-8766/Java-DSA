//insertion short?

public class ques6Sorting {
    public static void print(int arr[]) {
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {2,1,4,5,7,9,7,3,8};
        int n = arr.length;
        print(arr);
        System.out.println();
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        print(arr);
    }
    
}
