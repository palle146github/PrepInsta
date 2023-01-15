package workingwithnumbers;

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Decimal number");
        int decimal = s.nextInt();
        int decimal1 = decimal;
        int octal = 0;
        int temp = 0;
        int i = 0 ;
        while( decimal > 0){
            temp = decimal % 10;
            octal = octal + temp * (int)(Math.pow( 8 , i));
            decimal /= 10;
            i = i + 1;
        }
    }
}
