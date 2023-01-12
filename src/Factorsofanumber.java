import java.util.Scanner;
public class Factorsofanumber {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n1 = 0, n2 = 1, res=1, number1;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number");
        number1 = sc.nextInt();
        System.out.println(" Factors of " + number1);
        for( int i = 1; i <= number1 ; i++) {
            if( number1 % i == 0) {
                System.out.print(" " + i );
            }
        }


    }
}
