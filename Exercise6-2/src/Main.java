import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int num1 = a;
        int num2 = b;

        while(num1 != num2) {
            if (num1 > num2)
            {
                num1 -= num2;
            }
            else {
                num2 -= num1;
            }

        }

        System.out.printf("The largest common divider of " +a +" and " +b +" is " + num1);
    }
}