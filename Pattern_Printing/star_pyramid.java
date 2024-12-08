/* Print the pattern
        *
      * * *
    * * * * *
  * * * * * * *
*/





package Pattern_Printing;

import java.util.Scanner;

public class star_pyramid {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("- ");     // representing spaces for better understanding
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j=2; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
