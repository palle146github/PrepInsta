import java.util.Scanner;
public class Factorialofanumber {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n1 = 0, n2 = 1, next, number;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number");
        number = sc.nextInt();
        System.out.println("Factorail of " + number);
        int factorial = 1;
        for( int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.print( factorial );

    }

}
