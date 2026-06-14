// selection sort algorithm

public class ques5Sorting {
    public static void print(int arr[]) {
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {2,4,-8,-2,9,6,4,2,7,1};
        int n = arr.length;
        print(arr);
        System.out.println();
        for(int i=0;i<n-1;i++){
            int min = Integer.MIN_VALUE;
            int mindex = 1;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min = arr[j];
                    mindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = temp;
        }
        print(arr);
    }
    
}
