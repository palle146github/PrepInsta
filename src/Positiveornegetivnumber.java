import java.util.Scanner;

public class Positiveornegetivnumber {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number==>");
        int number = s.nextInt();
        if (number > 0) {
            System.out.println("Number is Positive");
        } else if (number < 0) {
            System.out.println("Number is Negetive");
        } else
            System.out.println("Number is zero");
    }
}
