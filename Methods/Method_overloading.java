package Methods;

public class Method_overloading {
    
    static void learn(){
        System.out.println("Lets learn method overloading. ");
    }

    static void learn(int a){
        System.out.println("The value of a is: " + a );
    }

    static void learn(int a, int b){
        int c = a + b;
        System.out.println("The sum of a and b is: " + c);
    }
    public static void main(String[] args) {
        learn();
        learn(10);
        learn(15, 10);
    }
}

/*
 * In Java, it is possible for a class to contain two or more methods with the same name but with different parameters. 
 * Such methods are called Overloaded methods.
   Method overloading is used to increase the readability of the program.
 */
