package Methods;

public class change1 {
    
    static void change(int x){
         x = 50;
    }
    public static void main(String[] args) {
        int a = 45;
        change(a);
        System.out.println("The value of 'a' after change is: " + a);
    }
}

// Here the value of 'a' is not changed because the copy of 'a' variable is copied in the change method 
//so when we called the method in the main method its just gave the same value what we stored in variable 'a'.

//Detailed Explanation:-
/*
 * n Java, method arguments are passed by value. This means that when you pass a variable (like a) to a method, what is actually passed is a copy of the value stored in that variable.

In your code:

You declare an integer variable a and assign it a value of 45.
When you call change(a), the value 45 is copied and passed to the change method.
Inside the change method, the parameter x is a local variable, which holds the copied value 45. When you assign 50 to x, it changes the value of this local copy, not the original variable a in the main method.
Therefore, when you print the value of a in the main method, it still holds the original value 45, as the change made inside the change method does not affect the original variable.

 */
