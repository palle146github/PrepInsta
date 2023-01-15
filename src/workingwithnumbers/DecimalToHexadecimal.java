package workingwithnumbers;
import java.util.Scanner;

public class DecimalToHexadecimal {
    static void character(int number){
        String a = null;

        System.out.println(a);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a positive decimal number");
        int decimal = s.nextInt();
        int decimal1 = decimal;
        String[] hexa = new String[20];
        int temp = 0;
        int i = 0;
        while( decimal > 0){
            temp = decimal % 16;
            if( temp > 9 ){
                switch (temp){
                    case 15:
                        hexa[i] = "F";
                        break;
                    case 14:
                        hexa[i] = "E";
                        break;
                    case 13:
                        hexa[i] = "D";
                        break;
                    case 12:
                        hexa[i] = "C";
                        break;
                    case 11:
                        hexa[i] = "B";
                        break;
                    case 10:
                        hexa[i] = "A";
                        break;
                }
            }
            else{
                hexa[i] = String.valueOf(temp);
            }
            decimal /= 16;
            i = i + 1;
        }
        System.out.println(i);
        System.out.println("Hexadecimal of " + decimal1 +" is ");
        for( int j = i - 1; j >= 0; j--){
            System.out.print(hexa[j]);}
    }
}
