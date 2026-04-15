package onecompiler.challenge.middle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Challenge2 {
    public static void main(String args[]){
        boolean isValid = false;
        System.out.println("Type a number and I will print the odd numbers to that number:");
        try(Scanner scanner = new Scanner(System.in)){
            while (!isValid) {
                try {
                    int n = scanner.nextShort();
                    if(n>0) {
                        isValid = true;
                        printEvenNumbers(n);
                    }else{
                        System.out.println("Only positive numbers allowed, try again");
                    }
                }catch(InputMismatchException e){
                    System.out.println("Only numbers allowed, try again:");
                    scanner.next();
                }
            }
        }
    }
        private static void printEvenNumbers(Integer n){
            boolean isFirst = true;
            for(int i=0;i<=n;i++){
                boolean isEven = false;
                if(i%2==0){
                    isEven = true;
                }
                if(isEven && isFirst){
                    System.out.print(i);
                    isFirst = false;
                }else if(isEven && !isFirst){
                    System.out.print(",");
                    System.out.print(i);
                }
            }
        }
    }
