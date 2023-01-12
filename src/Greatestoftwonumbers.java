import java.util.Scanner;
public class Greatestoftwonumbers {
    // TODO Auto-generated method stub
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number1==>");
        int number1 = s.nextInt();
        System.out.println("Enter a number2==>");
        int number2 = s.nextInt();
        if(number1 > number2){
            System.out.println(number1 + " is greater than " + number2);
        }
        else{
            System.out.println(number2 + " is greater than " + number1);
        }


    }
}
