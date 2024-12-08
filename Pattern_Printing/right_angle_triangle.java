package Pattern_Printing;

import java.util.Scanner;

public class right_angle_triangle {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows");
        int rows = sc.nextInt();

        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.printf("* ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
