import java.util.Scanner;

public class FriendlyPair {
    static int FactorSum(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number ==> ");
        int a = s.nextInt();
        System.out.println("Enter second number ==> ");
        int b = s.nextInt();
        int c = FactorSum(a);
        int d = FactorSum(b);
        int ratio1 = c / a;
        int ratio2 = d / b;
        if (ratio1 == ratio2) {
            System.out.println(a + "," + b + "are friendly pairs");
        } else {
            System.out.println(a + "," + b + "are not a friendly pairs");
        }
    }
}
