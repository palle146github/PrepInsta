import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is a perfect square or not");
        int n = s.nextInt();
        double sqrt = Math.sqrt(n);
        if( Math.floor(sqrt) == Math.ceil(sqrt)){
            System.out.println(n + " is a perfect square");
        }
        else{
            System.out.println(n + " is not a perfect square");
        }
    }
}
