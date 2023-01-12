import java.util.Scanner;
public class Leapyearornot {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a year==>");
        int number1 = s.nextInt();

        if(number1 % 400 == 0 || (number1 % 4 == 0 && number1 % 100 != 0)){
            System.out.println(number1 + "is a Leap year ");
        }
        else{
            System.out.println(number1 + "is not a Leap year ");
        }


    }
}
