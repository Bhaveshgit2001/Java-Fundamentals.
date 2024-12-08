package Arrays;

public class even_numbers {
    
    public static void main(String[] args) {
        int num[] = {2,4,6,7,9,3};
        for(int i=0; i<num.length; i++){
            if(num[i]%2==0){
                System.out.println("Even number is "+num[i]);
            }
            else{
                System.out.println("Odd number is "+num[i]);
            }
        }
    }
}
