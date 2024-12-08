public class addition_example {

    static int sum(int x, int ...arr){
    int result = x;
    for(int a : arr){
        result += a;
    }
    return result;
    }
    
    public static void main(String[] args) {
       // System.out.println("The sum of the given number is: " + sum(1));
        System.out.println("The sum of the given number is: "+ sum(10,10,20,30,40));
    }
}
