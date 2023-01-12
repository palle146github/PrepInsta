import java.util.Scanner;
public class Palindromnumber {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        number = sc.nextInt();
        int number2=number;
        int n1, reverse = 0;
        while( number != 0) {
            n1 = number % 10;
            reverse = reverse * 10 + n1;
            number = number/10;
        }
        if( number2 == reverse ) {
            System.out.println(number2 + " is a palindrom");
        }
        else {
            System.out.println(number2 + " is not a palindrom");
        }

    }
}
