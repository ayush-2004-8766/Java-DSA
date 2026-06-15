//If cost price and selling price of an item is input through the keybord , write a program to determine whether the 
// seller has made profit or incurred loss or no profit no loss . Also determine how much profit he made or loss he incurred?

import java.util.Scanner;
public class question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the cost price = ");
        int cost = sc.nextInt();
        System.out.print("enter the selling price : ");
        int sell = sc.nextInt();
        sc.close();
        if(sell>cost){
            System.out.println(sell-cost);
            System.out.println("seller made a profit");
        }
        else if(sell==cost){
            System.out.println(sell-cost);
            System.out.println("no profit no loss");

        }
        else{
            System.out.println(sell-cost);
            System.out.println("sellr made a loss");
        }

    }
    
}
