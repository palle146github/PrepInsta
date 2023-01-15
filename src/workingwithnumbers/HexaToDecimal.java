package workingwithnumbers;

import java.util.Scanner;

public class HexaToDecimal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a Hexadecimal number to convert it into decimal");
            String hex = s.nextLine();
            char value;
            String digits = "0123456789ABCDEF";
            int pow = 0;
            int decimal = 0;
            hex = hex.toUpperCase();
            for (int i = hex.length() - 1; i >= 0; i--) {
                value = hex.charAt(i);
                int num = digits.indexOf(value);
                decimal = decimal + (int) (num * Math.pow(16, pow++));
            }
            System.out.println("Decimal value of " + hex + " is " + decimal);
        }
    }
}

