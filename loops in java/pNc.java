import java.util.Scanner;
public class pNc {
    public static long fact(int n){
        long fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;

        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter n =");
        int n = sc.nextInt();
        System.out.print("enter r =");   
        int r = sc.nextInt();
        sc.close();
        long nfact = fact(n);
        long nrfact= fact(n-r);
        long rfact = fact(r);
        long nCr = nfact/(rfact*nrfact);
        long nPr = nfact/nrfact;
        System.out.println(nCr);
        System.out.println(nPr);     
    }
    
}
