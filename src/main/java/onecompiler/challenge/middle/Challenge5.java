package onecompiler.challenge.middle;

import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args){
        int rows = 0;
        int nums = 0;
        try(Scanner scanner = new Scanner(System.in)){
            rows = scanner.nextShort();
        }

        for(int i=1; i<=rows; i++){
            for(int j=1;j<=i; j++){
                nums++;
                System.out.print(nums);
            }
            System.out.println("");
        }
    }
}
