public class reverseArray {
    public static void main(String[] args) {
        int arr[] = {67,8,95,45,34,23,55,4,56,67};
       
        int i = 0, j = arr.length-1;
        while(i<j){
            int temp = arr[i];
             arr[i]=arr[j];
             arr[j] = temp;
            i++;
            j--;
        }
        for(int ele:arr){
            System.out.print(ele +" ");
        }
    }
    
}
