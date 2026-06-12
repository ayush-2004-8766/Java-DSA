public class reverseArray2 {
    public static void main(String[] args) {
        int arr[] = {23,56,45,34,56,78,67,56,98,0,56,34};
        int i=0, j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
