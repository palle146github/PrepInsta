import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Prepinsta Programs");
        System.out.println("Enter First number");
        int number = s.nextInt();
        System.out.println("Enter second number");
        int number1 = s.nextInt();
        System.out.println("Enter third number");
        int number2 = s.nextInt();
        System.out.println("Enter year");
        int year = s.nextInt();
        positiveorNegetive(number);
        evenorOdd(number);
        SumOfNaturalnumber(number);
        SumofNumberRange(number, number1);
        greatesofTwo(number, number1);
        greatesofThree(number, number1, number2);
        LeapYearorNot(year);
        checkPrime(number);
    }

    static void positiveorNegetive(int number) {
        if (number > 0) {
            System.out.println(number + " is a Positive Number");
        } else if (number < 0) {
            System.out.println(number + " is a Negative Number");
        } else {
            System.out.println(number + " Neither negative nor positive");
        }
    }

    static void evenorOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is a Even number");
        } else {
            System.out.println(number + " is a Odd number");
        }
    }

    static void SumOfNaturalnumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of N natural numbers " + sum);
    }

    static void SumofNumberRange(int number, int number1) {
        int sum = 0;
        for (int i = number; i <= number1; i++) {
            sum = sum + i;
        }
        System.out.println("Sum is " + sum);
    }

    static void greatesofTwo(int number, int number1) {
        if (number > number1) {
            System.out.println(number + " is Greater than " + number1);
        } else {
            System.out.println(number1 + " is Greater than " + number);
        }
    }

    static void greatesofThree(int number, int number1, int number2) {
        if (number > number1 && number > number2) {
            System.out.println(" Greatest of three numbers is " + number);
        } else if (number1 > number && number1 > number2) {
            System.out.println(" Greatest of three numbers is " + number1);
        } else {
            System.out.println(" Greatest of three numbers is " + number2);

        }
    }

    static void LeapYearorNot(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Year is a Leap year");
        } else {
            System.out.println("Year is not a Leap year");
        }
    }
     static void checkPrime(int n) {
        int count = 0;
        if (n < 2)
            System.out.println ("The given is number " + n + " is not prime");
        for (int i = 1; i <= n; i++)
        {
            if (n % i == 0)
                count += 1;
        }
        if (count > 2)
            System.out.println ("The given is number " + n + " is not prime");
        else
            System.out.println ("The given is number " + n + " is prime");
    }
}