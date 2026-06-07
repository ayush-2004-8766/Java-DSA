//w.r.a.p to check the number is even or odd using ternary operater?
import java.util.Scanner;
public class ternaryoperater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number = ");
        int x = sc.nextInt();
        sc.close();
        //(condition ? sach:jhoot)
        System.out.println((x%2==0) ? "even number" : "odd number");

    }
    
}
