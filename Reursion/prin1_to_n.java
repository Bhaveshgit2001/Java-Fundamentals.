package Reursion;

public class prin1_to_n {
    
    static void num(int n){
        if(n>0){
            num(n-1);               //Recursivecall.
            System.out.println(n);  //Print the current value of n when the condition gets false recursive call unwind and start printing the numbers.
        }
    }
    public static void main(String[] args) {
        int a = 3;
        num(a);
    }
}

/*Definition:- In  programming, recursion is a technique through which a function calls itself.
With the help of recursion, we can break down complex problems into simple problems.
*/
