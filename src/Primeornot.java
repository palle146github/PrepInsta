import java.util.Scanner;

public class Primeornot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            System.out.println("Enter any number to check whether it is a prime number or not");
            int number = s.nextInt();
            boolean isPrime = true;
            if (number < 2) {
                isPrime = false;
            } else {
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            String result = isPrime ? "is a Prime" : "not a Prime";
            System.out.println("The number " + number + " is : " + result);
        }
    }
