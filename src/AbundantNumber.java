import java.util.Scanner;
public class AbundantNumber {
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
        System.out.println("Enter a number ==> ");
        int a = s.nextInt();
        int sumofFactors = FactorSum(a);
        if ( sumofFactors > a ){
            System.out.println(a + " is a Abundant number");
        }
        else{
            System.out.println(a + " is not a Abundant number");
        }
    }
}
