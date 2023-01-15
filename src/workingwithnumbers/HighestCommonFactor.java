package workingwithnumbers;

import java.util.Scanner;

public class HighestCommonFactor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number1 ");
        int number1 = s.nextInt();
        System.out.println("Enter number2 ");
        int number2 = s.nextInt();
        int min;
        number1 = (number1 > 0) ? number1 : -number1;
        number2 = (number2 > 0) ? number2 : -number2;
        if( number1 < number2){
            min = number1;
        }
        else{
            min = number2;
        }
        int hcf = 0;
        for( int i = 1; i <= min; i++){
            if( number1 % i == 0 && number2 % i == 0){
            hcf = i;
            }
        }
        System.out.println("Highest Common Factor of Two number is ");
        System.out.println(hcf);
    }

}
