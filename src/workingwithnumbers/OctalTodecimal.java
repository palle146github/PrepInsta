package workingwithnumbers;

import java.util.Scanner;

public class OctalTodecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Octal number to convert it to Decimal ");
        int octal = s.nextInt();
        int temp = 0;
        int decimal = 0;
        int octal1 = octal;
        int i = 0;
        while( octal > 0){
            temp = octal % 10;
            decimal = decimal + (int)(temp * Math.pow( 8,i ));
            octal = octal / 10;
            i = i + 1;
        }
        System.out.println("Decimal equivalent of " + octal1 + " is " + decimal);
    }

}
