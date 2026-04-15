package onecompiler.challenge.middle;

import java.util.Scanner;

public class Challenge4 {

    public static void main(String[] args){
        int floors = 0;
        int spaces = 0;
        int stars = 0;
        try(Scanner scanner = new Scanner(System.in)){
            floors = scanner.nextShort();
            for(int i=1;i<=floors;i++){
                StringBuffer sb = new StringBuffer();
                spaces = floors-i;
                stars = i+(i-1);
                sb.append(" ".repeat(spaces));
                sb.append("*".repeat(stars));
                System.out.println(sb.toString());
            }
        }
    }
}
