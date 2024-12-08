package Conditional_Statement.if_else_statement;

import java.util.Scanner;

public class Profit_and_loss {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price: ");
        int cost_price = sc.nextInt();

        System.out.println("Enter the selling price");
        int selling_price = sc.nextInt();

        if(cost_price < selling_price){
            System.out.println("It is profit");
        }
        else if(selling_price < cost_price){
            System.out.println("It is loss");
        }
        else{
            System.out.println("No profit no loss");
        }
        sc.close();
    }
}
