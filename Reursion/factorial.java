package Reursion;

public class factorial {
    static int factorial_of(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{                                         // method 1
            return n*factorial_of(n-1);
        }
    }
    static int iterative_factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{                                     //Method 2
            int product = 1;
            for(int i=1 ; i<=n; i++){
                product*=i;
            }
            return product;
        }
    }
    
    public static void main(String[] args) {
        int x = 5;
        System.out.println("The value of method 1 factorial is: "+factorial_of(x));
        System.out.println("The value of the method 2 factorial is: " + iterative_factorial(x));
    }

}
