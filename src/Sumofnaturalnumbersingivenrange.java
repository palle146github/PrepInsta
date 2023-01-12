
import java.util.Scanner;
public class Sumofnaturalnumbersingivenrange {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number1==>");
        int number1 = s.nextInt();
        System.out.println("Enter a number2==>");
        int number2 = s.nextInt();
        int sum=0;
        for(int i = number1; i <= number2; i++){
            sum = sum + i;
        }
        System.out.println("Sum of N natural Numbers==>"+sum);

    }

}
