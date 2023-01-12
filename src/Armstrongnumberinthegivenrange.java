import java.util.Scanner;
public class Armstrongnumberinthegivenrange {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int number1,number2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter low number");
        number1 = sc.nextInt();
        System.out.println("Enter high number");
        number2 = sc.nextInt();
        for (int i = number1; i<= number2; i++){
            int number3=i;
            String str = Integer.toString(i);
            // computing the size of the string
            int size = str.length();
            int sum = 0, temp = i, digit;
            while( temp != 0) {
                digit = temp % 10;
                sum = (int) (sum + Math.pow( digit, size ));
                temp= temp / 10;
            }
            if( sum == number3 ) {
                System.out.println(number3);
            }



        }

    }
}
