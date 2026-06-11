//print the maximum element in the array?
public class arrayQues4 {
    public static void main(String[] args) {
        int arr[]= {1,4,7,98,67,56,45,67,5};
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
    
}
