import java.util.Scanner;

public class Nthtermoffibonacciseries {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n1 = 0, n2 = 1, next = 0, number;
        System.out.print("Enter a number for fibonacci series ==> ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        System.out.print("Nth term in the fibonacci series ==> ");
        for( int i = 2; i < number; i++) {
            next = n1 + n2;
            n1 = n2;
            n2 = next;
        }
        System.out.println(next);
    }

}
