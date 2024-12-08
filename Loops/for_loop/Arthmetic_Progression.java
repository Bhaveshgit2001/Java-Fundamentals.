package Loops.for_loop;

import java.util.Scanner;

public class Arthmetic_Progression {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

          //Arithmetic Progression problem for n terms   //METHOD 1
         //1,3,5,7....n upto n terms
        //an = a+(n-1)d    where a = 1st term , d = common difference
       //an = 1+(n-1)2
      //an = 2n-1
       for(int i=1 ; i <= 2*num-1; i=i+2){
        System.out.println(i + ", ");
       }
       sc.close();
    }
}
