import java.util.Scanner;
public class Powerofanumber {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n1 = 0, n2 = 1, res=1, number1, power;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number");
        number1 = sc.nextInt();
        System.out.println(" Enter power");
        power = sc.nextInt();
        for( int i = 1; i <= power ; i++) {
            res = res * number1;
        }
        System.out.println( number1 + " power of " + power + " = " + res);

    }
}
