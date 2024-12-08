package Arrays;

public class sum_of_elements {
    
    public static void main(String[] args) {
        int num[] = {2,3,4,5,7};
        int sum = 0;
        for(int i=0; i<num.length; i++){
            sum+=num[i];
        }
        System.out.println("The sum of elements is "+sum);
    }
}
