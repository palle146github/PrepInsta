import java.util.Scanner;
import java.util.*;
public class AutomorphicNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to check whether it is Automorphic number or not");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int number = n;
        int square = n * n;
        int result = 0;
        while (n != 0) {
            if (n % 10 == square % 10) {
                result = result + 1;
            } else {
                result = result;
            }
            n = n / 10;
            square = square / 10;
        }
        int length = ((String.valueOf(number)).length());
        if ( length == result){
            System.out.println(number  + " is an Automorphic number");
        }
        else{
            System.out.println(number + length + " is not an Automorphic number");
        }
    }
}