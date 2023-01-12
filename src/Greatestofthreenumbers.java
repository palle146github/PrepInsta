import java.util.Scanner;
public class Greatestofthreenumbers {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number1==>");
        int number1 = s.nextInt();
        System.out.println("Enter a number2==>");
        int number2 = s.nextInt();
        System.out.println("Enter a number2==>");
        int number3 = s.nextInt();
        if(number1 > number2 && number1 > number3){
            System.out.println(number1 + "is Greatest number ");
        }
        else if(number2 > number1 && number2 > number3){
            System.out.println(number2 + "is Greatest number ");
        }
        else{
            System.out.println(number3 + "is Greatest number ");
        }

    }
}
