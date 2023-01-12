import java.util.Scanner;
public class Numberisevenorodd {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number==>");
        int number= s.nextInt();
        if(number%2==0){
            System.out.println("Number is a Even Number");
        }
        else{
            System.out.println("Number is a Odd Number");
        }
    }
}
