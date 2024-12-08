package Arrays;

public class for_each_loop {
    
    public static void main(String[] args) {
        int marks[] = {45,50,60,70,80};
        for(int i : marks){
            System.out.println(i);
        }
    }
}


// We use for each loop when we just want to access the element not their index.