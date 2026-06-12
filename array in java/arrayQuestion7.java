public class arrayQuestion7 {
    public static void main(String[] args) {
        int arr[] = {5,9,6,4,3,2,5,6,7,8};
        int target = 10;
        boolean found = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                found=true;
                break;
            }
            
        }
        if(found){
                System.out.println("enter numberb is exist in array");
            }
        else{
            System.out.println("enter number is not exist in array");
        }
    }
    
}
