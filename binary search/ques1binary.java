// basic binary search code?

public class ques1binary {
    public static void print(int arr[]) {
        for(int ele:arr){
            System.out.print(+ele+" ");
        }
        
    }
    
    public static void main(String[] args) {
        int arr[]  = {1,3,4,5,65,68,69,88,89,99,999,9999,99999};
        int target = 88;
        int n = arr.length;
        print(arr);
        int lo = 0, hi = n-1;
        int mid = (lo+hi)/2;
        while(lo<=hi){
            if(arr[mid]>target){
                lo = mid-1;
            }
            else if(arr[mid]<target){
                hi = mid+1;
            }
            else if(arr[mid]==target){
                System.out.print("target found at middel"+mid);
            }
            else{
                System.out.print("target not found");
            }
        }

        
    }
    
}
