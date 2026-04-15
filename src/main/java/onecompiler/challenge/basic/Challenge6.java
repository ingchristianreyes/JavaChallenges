package onecompiler.challenge.basic;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Challenge6 {

    private static Integer MAXVAL= 9;
    private static Integer MINVAL= 0;
    private static Map<Integer,String> map = Map.ofEntries(
            Map.entry(0,"Zero"),
            Map.entry(1,"Uno"),
            Map.entry(2,"Two"),
            Map.entry(3,"Three"),
            Map.entry(4,"Four"),
            Map.entry(5,"Five"),
            Map.entry(6,"Six"),
            Map.entry(7,"Seven"),
            Map.entry(8,"Eight"),
            Map.entry(9,"Nine")
            );

    private static String[] digits = {"zero","one","two","three","four","five", "six", "seven", "eight", "nine"};

    public static void main(String args[]){
        Integer input = null;
        boolean isValid = false;
        try(Scanner scanner = new Scanner(System.in)){
            while(!isValid) {
                System.out.println("Type an int between 0 and 9:");
                try {
                    input = (int) scanner.nextShort();
                    if (input >= MINVAL && input <= MAXVAL) {
                        isValid = true;
                        System.out.println(digits[input]);
                    } else {
                        System.out.println("Out of range, try again, you should type an int between 0 and 9");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input, you should type an int between 0 and 9");
                    scanner.next();
                }
            }
        }
    }

    private static String getString(Integer value){
        String str = switch(value){
            case 0 -> "Zero";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            default -> "";
        };
        return str;
    }
}
