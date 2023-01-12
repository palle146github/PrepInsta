import java.util.Scanner;

public class Perfectnumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is a Perfect number or not");
        int number = s.nextInt();
        int sum = 0;
        for(int i = 1; i < number; i++){
            if( number % i == 0){
                sum = sum + i;
            }
        }
        if( sum == number){
            System.out.println(number + " is a Perfect number");
        }
        else{
            System.out.println(number + " is not a Perfect number");
        }
    }
}
