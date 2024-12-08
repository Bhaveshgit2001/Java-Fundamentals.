package Strings;

import java.util.Scanner;
public class length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String name; ");
        String name = sc.nextLine();
        int value = name.length();         // Retuns the length of the string
        System.out.printf("Length of the string %s is %d: ",name, value);
        sc.close();
    }
}
