//Given a point (x,y)write a program to find out if it lies in the 1st quad, 2nd quad,
//3rd quad, 4th quad, on the x axis, y axis or at the origin?
import java.util.Scanner;
public class question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of x = ");
        int x = sc.nextInt();
        System.out.print("enter the value of y : ");
        int y = sc.nextInt();
        sc.close();
        if(x == 0 && y == 0){
            System.out.println("the point lies on the origin");
        }
        else if(x == 0){
            System.out.println("the point lies on y axis");

        }
        else if(y == 0){
            System.out.println("the point lies on the x axis");
        }
        else if(x > 0 && y > 0){
            System.out.println("the point lies in the first quadrent");
        }
        else if(x<0 && y>0){
            System.out.println("point lies in second quadrent");
        }
        else if(x<0 && y<0){
            System.out.println("the point lies in the third quadrent");
        }
        else{
            System.out.println("the point lies in fourth quadrent");
        }
    }
    
}
