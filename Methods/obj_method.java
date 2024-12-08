package Methods;

public class obj_method {
    int logic(int x, int y){
        int z;
        if(x > y){
            z = x + y;
        }
        else{
            z = (x+y)*6;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        obj_method obj = new obj_method();
        c = obj.logic(a,b);                  //Method invocation using object creation
        System.out.println(c);
    }
}
