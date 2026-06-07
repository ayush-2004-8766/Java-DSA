//Take length and bredth of rectangle as input and w.r.a.p to find the ares of rectangle 
//is gretter than paremeter?
//area of rectangle = length*bredth
//paremeter of rectangle = 2(l+B)
import java.util.Scanner;
public class question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of rectangle =");
        int length = sc.nextInt();
        System.out.print("enter the bredth of rectangle =");
        int bredth = sc.nextInt();
        sc.close();
        int area = length*bredth;
        System.out.println("the area of rectangle ="+(area)); 
        int paremeter = 2*(length+bredth);
        System.out.println("the paremeter of rectangle ="+(paremeter));
        if(area>paremeter){
            System.out.println("area is gretter than paremeter");
        }
        else{
            System.out.println("paremeter is gretter than area");
        }
    }
    
}
