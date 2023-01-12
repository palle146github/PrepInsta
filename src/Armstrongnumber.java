import java.util.Scanner;

public class Armstrongnumber {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        number = sc.nextInt();
        int number2=number;
        int n1=0, reverse = 0;
        String str = Integer.toString(number);
        // computing the size of the string
        int size = str.length();
        System.out.println(size);
        int sum = 0, temp = 0;
        while( number != 0) {
            temp = number % 10;
            sum = (int) (sum + Math.pow( temp, size ));
            number = number / 10;
        }
        if( sum == number2 ) {
            System.out.println(number2 + " is a armstrong number");
        }
        else {
            System.out.println(number2 + " is not a armstrong number");

        }

    }
}
