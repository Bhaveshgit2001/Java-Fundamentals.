package Arrays;

public class greatest_number {
    
    public static void main(String[] args) {
        int num[] = {2,4,6,15,10};
        int greatest = 0;
        for(int i=0; i<num.length; i++){
            if(num[i] > greatest){
                greatest = num[i];
            }
        }
        System.out.println("The greatest number is "+ greatest);
    }
}
