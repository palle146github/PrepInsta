import java.util.Scanner;

public class Primenumberinthegivenrange {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int number1, number2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number1  ==> ");
        number1 = sc.nextInt();
        System.out.println("Enter a number2==>");
        number2 = sc.nextInt();
        System.out.println("Prime numbers are in the given range ==> ");
        for( int i = number1; i <= number2; i++){
            if(isPrime(i)){
                System.out.println(i);       }
    }
}   static boolean isPrime(int number){
        if ( number < 2){
            return false;
        }
        for (int i = 2; i <= number; i++)
        {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
