import java.util.Scanner;

public class HarshadNumber {
    static int sumofDigits(int num) {
        int sum = 0;
        int temp = 0;
        while (num != 0) {
            temp = num % 10;
            sum = sum + temp;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to check whether number is Harshad number or not");
        int number = s.nextInt();
        int digitSum = sumofDigits(number);
        if (number % digitSum == 0) {
            System.out.println(number + " is a Harshad number");
        } else {
            System.out.println(number + " is not a Harshad number");
        }
    }
}