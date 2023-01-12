import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to print prime Factors");
        int number = s.nextInt();
        for (int i = 1; i <= number; i++) {
            if (isPrime(i)) {
                int temp = number;
                while ( temp % i == 0){
                    System.out.print(i + " ");
                    temp = temp / i;
                }
            }
        }
    }
    static boolean isPrime(int number){
        if ( number < 2){
            return false;
        }
        for (int i = 2; i < number; i++)
        {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}

