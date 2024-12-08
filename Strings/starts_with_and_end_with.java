package Strings;

import java.util.Scanner;

public class starts_with_and_end_with {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String name = sc.nextLine();

        System.out.println("Enter the start string: ");
        String sta_substring = sc.nextLine();
        boolean startwithString = name.startsWith(sta_substring);
        System.out.println("Returns true if the start of the substring is similar to the actual string = " + startwithString);

        System.out.println("Enter the end string: ");
        String end_subString = sc.nextLine();
        boolean endwithString = name.endsWith(end_subString);
        System.out.println("Returns true if the end of the substring is similar to the actual string = " + endwithString);
        sc.close();
    }
}
