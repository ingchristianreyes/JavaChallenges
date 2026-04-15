package onecompiler.challenge.middle;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Challenge1 {

    public static void main(String args[]){
        try(Scanner scanner  = new Scanner(System.in)){
            System.out.println("Type a line and I will detect the first letter not repeated in it: ");
            String repeated = detectFirstNonRepeatLetter(scanner.nextLine());
            System.out.println("First not repeated letter: "+repeated);
        }
    }

    private static String detectFirstNonRepeatLetter(String word){
        String result = "";

        for(int i=0; i<word.length(); i++){
            char searchedLetter = word.charAt(i);
            int countReps = 0;
            if (Character.isLetter(searchedLetter)){
                for(int j=0; j<word.length(); j++){
                    if(word.charAt(j)==searchedLetter){
                        countReps++;
                    }
                }
                if(countReps==1){
                    result+=searchedLetter;
                    break;
                }
            }
        }

        return result;
    }

}
