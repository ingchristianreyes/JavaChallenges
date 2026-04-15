package onecompiler.challenge.middle;

import java.util.Scanner;

public class Challenge3 {

    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            String line = scanner.nextLine();
            String charString = scanner.nextLine();

            long count = countOcurrencesWithFor(line,charString.charAt(0));
            System.out.println(charString+" appears "+count+" times in "+line);
        }
    }

    private static long countOcurrencesWithStream(String source, char charString) {
        long count = source.chars().map(a -> a=(char)a).filter(c -> charString==c).count();

        return count;
    }

    private static int countOcurrencesWithFor(String source, char charString){
        int count = 0;
        for(int i=0;i<source.length();i++){
            if(source.charAt(i)==charString){
                count++;
            }
        }
        return count;
    }
}
