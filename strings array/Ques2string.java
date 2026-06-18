// palendrome string
import java.util.Scanner;
public class Ques2string {
    public static boolean palindrome(String s) {
        int i = 0 , j = s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string :");
        String str = sc.nextLine();
        if(palindrome(str)){
            System.out.println("it is a palendrom string");
        }
        else{
            System.out.println("not a plaindrom string");
        }
    
        for(int i = 0; i<str.length();i++){
            System.out.println(str.charAt(i));
            
        }
        sc.close();

        
    }
    
}
