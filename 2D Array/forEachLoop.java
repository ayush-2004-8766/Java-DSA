public class forEachLoop {
    public static void main(String[] args) {
        int arr[][] = {{5,8,9,7,6,1},{8,9,8,7,4,5},{8,3,2,1,4,5}};
        for(int a[]:arr){
            for(int ele:a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
    
}
