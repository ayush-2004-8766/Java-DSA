//multiply odd indexed element by 2 and add 10 to even indexed elements?

public class arrayQues6 {
    public static void main(String[] args) {
        int arr[] = {2,4,6,5,3,9,7,8};
        print(arr);
        int i=0;
        for( i=0; i<arr.length;i++){
            if(i%2!=0){
                arr[i]= arr[i]*2;
            }
            else{
                arr[i] = arr[i]+10;
            }    
        }
        for( i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }    
    }
    public static void print(int arr[]) {
        for( int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            

        }
        
    }
    
}
