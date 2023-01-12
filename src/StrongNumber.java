import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is a strong number or not");
        int number = s.nextInt();
        int temp = 0, sum = 0;
        int n = number;
        while ( number != 0){
            temp = number % 10;
            sum = sum + factorial(temp);
            number = number / 10;
        }
        if( sum == n){
            System.out.println(n + " is a Strong number");
        }
        else{
            System.out.println(n + " is not a Strong number");}
}   static int factorial(int num) {
        if ( num == 0){
            return 1;
        }
        else{
            return ( num * factorial(num - 1));
        }
    }
}
