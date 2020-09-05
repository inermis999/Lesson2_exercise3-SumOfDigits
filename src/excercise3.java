import java.util.Scanner;

public class excercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input any number: ");
        int number = in.nextInt();
        int sum = 0;


        while(number > 0){

            sum = sum + number%10;
            number = number/10;
        }

  System.out.println(sum);
    }
}
