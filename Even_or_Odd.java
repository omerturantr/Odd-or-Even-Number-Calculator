import java.util.Scanner;     // Activing 'Scanner' Library

public class Even_or_Odd {
    public static void main(String[] args) {

        int number;     // Declaring the Variable

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an Integer: ");   number = input.nextInt();     // Receiving Input from the user.

        if(number % 2 == 0) {    
            System.out.print(number + " is an EVEN Integer.");     // If the number is exactly divisible by 2, print this message.
        }
        else {
            System.out.print(number + " is an ODD Integer.");     // If the number is not exactly divisible by 2, print this message.
        }
    }
}
