package onecompiler.challenge.middle;

import java.util.Scanner;

public class Challenge7 {
    public static void main(String[] args){
        String emailAddress = null;
        int indexOfAt = 0;
        String name = "";
        try (Scanner scanner  = new Scanner(System.in)){
            emailAddress = scanner.nextLine();
        }

        indexOfAt = emailAddress.indexOf("@");
        name = emailAddress.substring(0,indexOfAt);

    }
}
