package Loops.while_loop;

public class ASCII_value_alphabets {
    
    public static void main(String[] args) {
        int upper_case = 65;
        int lower_case = 97;
        System.out.println("Upper case alphabets");
        while (upper_case <= 90) {
            System.out.println(upper_case + "->" + (char)upper_case);
            upper_case++;
        }
        System.out.println("Lower case alphabets");
        while (lower_case <= 122){
            System.out.println(lower_case + "->" + (char)lower_case);
            lower_case++;
        }

    }
}
