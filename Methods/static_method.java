package Methods;

public class static_method {
    static int logic(int x , int y){         //Method invocation using static method.
        int z;
        if(x>y){
            z = x+y;
        }
        else{
            z = (x+y)*6;
        }
        return z;

    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c;
        c = logic(a, b);
        System.out.println(c);

        int a1 = 5;
        int b1 = 10;
        int c1;
        c1 = logic(a1, b1);
        System.out.println(c1);
    }
}
