package onecompiler.challenge.middle;

import java.util.Scanner;

public class Challenge6 {

    public static void main(String args[]){
        System.out.println("Type a single line and hit enter, I will count letters and digits:");
        int letterCount = 0;
        int digitCount = 0;
        try(Scanner scanner = new Scanner(System.in)) {

            String reading = scanner.nextLine();

            for(int i=0; i<reading.length(); i++){
                char c = reading.charAt(i);
                if (Character.isLetter(c)) {
                    letterCount++;
                } else if(Character.isDigit(c)){
                    digitCount++;
                }
            }
        }
        System.out.println("Letters: "+letterCount);
        System.out.println("Digit: "+digitCount);
    }
}