package workingwithnumbers;
import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Binary number to convert it to Decimal ");
        int binary = s.nextInt();
        int temp = 0;
        int decimal = 0;
        int binary1 = binary;
        int i = 0;
        while (binary > 0) {
            temp = binary % 10;
            decimal = decimal + (int) (temp * Math.pow(2, i));
            binary = binary / 10;
            i = i + 1;
        }
        System.out.println("Decimal equivalent of " + binary1 + " is " + decimal);
    }
}