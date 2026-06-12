public class twoSum{
    public static void main(String[] args) {
        int arr[]={3,6,7,8,4,5,67,9};
        int target = 9;
        System.out.println(twosum(arr,target));
    }
    public static boolean twosum(int arr[], int target) {
        int n = arr.length;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return true;
                }
            }
            
        }
        return false;



        
    }

}