import java.util.Scanner;
public class Sumofdigitsofanumber {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Sum of the digits");
        int number = sc.nextInt();
        int sum = 0, n1;
        while (number != 0) {
            n1 = number % 10;
            sum = sum + n1;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
