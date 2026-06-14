// optimised code for bubble short ?

public class ques3sorting {
    public static void print (int arr[]) {
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,3,6,7,8,7,5};
        int n =arr.length;
        print(arr);
        System.out.println();
        for(int i=0;i<n-1;i++){  
           int swap =0 ;
            for(int j =0; j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if (swap==0)break;
            
        }
        print(arr);
        
    }
    
}
