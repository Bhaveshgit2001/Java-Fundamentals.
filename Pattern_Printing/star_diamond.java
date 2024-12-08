/* Print the pattern
        *
      * * *
    * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
*/

package Pattern_Printing;

import java.util.Scanner;

public class star_diamond {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n");
        int n = sc.nextInt();
         // Upper pyramid
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");   // representing spaces for better understanding
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j=2; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
            
        }
        // Lower Pyramid
        for(int i = n-1; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");  // representing spaces for better understanding
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
