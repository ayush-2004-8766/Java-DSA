//print all alphabets with their corresponding ASCII values?
//A=65,B=67....Z=90?
import java.util.Scanner;
public class loop8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        for(int i =65; i<=90;i++){
            System.out.println((char)i+" = "+i);
        }
    }
    
}
