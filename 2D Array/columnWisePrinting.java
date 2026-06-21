public class columnWisePrinting {
    public static void main(String[] args) {
        int arr[][] = {{5,8,9,7,6,1},{8,9,8,7,4,5},{8,3,2,1,4,5}};
        for(int j = 0; j<arr[0].length;j++){
            for(int i = 0; i <arr.length;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
