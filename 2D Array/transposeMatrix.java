public class transposeMatrix {
    public static void print(int arr[][]) {
        for(int [] a:arr){
            for(int ele:a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        int arr[][] = {{2,3,6,5,8},{4,5,6,9,7},{7,8,9,6,5},{2,3,6,9,4}};
        print(arr);
        //transpose
        for(int i =0; i<arr.length;i++){
            for(int j=0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        print(arr);
    }
    
}
