import java.util.Scanner;

public class Simple_Interest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount");
        int amount = sc.nextInt();

        System.out.println("Enter the interest");
        float interest = sc.nextFloat();

        System.out.println("Enter the time period in years");
        float time = sc.nextFloat();

        float Simple_Interest = (amount*interest*time)/100;
        System.out.printf("The simple interest on given amount %d on the interest %f for the tenure %f is %f15",amount, interest, time, Simple_Interest);
        sc.close();
    }
}
