public class rowWithMaxSum {
    public static void main(String[] args) {
        int arr[][] = {{2,3,4,5},{6,5,4,8},{7,8,9,6}};
        int maxsum = Integer.MIN_VALUE;
        int row = -1;
        for(int i = 0; i<arr.length;i++){
            int sum = 0;
            for(int j=0;j<arr[0].length;j++){
                sum = sum+arr[i][j];
                if(sum>maxsum){
                    maxsum = sum;
                    row = i;
                }

            }
            System.out.println(row+" "+maxsum);
        }
    }
    
}
