// Take a string as input and print all the vovel present in it?
import java.util.Scanner;
public class ques1string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string :");
        String s = sc.nextLine();
        int count = 0;
        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch== 'a' || ch== 'e' || ch== 'i' || ch== 'o' || ch== 'u')
                count++;
        }
        System.out.println(count);
        sc.close();
    }
    
    
}
