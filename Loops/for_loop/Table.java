package Loops.for_loop;

import java.util.Scanner;

public class Table {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int result = 1;

        for(int i=1 ; i<=10; i++){
            result = num*i;
            System.out.printf("%d*%d=%d\n", num,i,result);
        }
        sc.close();
    }
}
