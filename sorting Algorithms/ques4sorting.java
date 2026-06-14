// Move zeros to end ?

public class ques4sorting {
    public static void print(int arr[]) {
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {2,0,5,0,8,7,0,0,7,9,0,8,9,0};
        int n = arr.length;
        print(arr);
        System.out.println();

        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j] = temp; 
                j++;
            }
        }

        // for(int i=0;i<n-1;i++){
        //     for(int j = 0; j<n-1-i; j++){
        //         if(arr[j]==0){
        //             int temp = arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        print(arr);
        
    }
    
}
