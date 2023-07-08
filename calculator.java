import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        Double num1 = sc.nextDouble();
        System.out.println("Enter the Second Number");
        Double num2 = sc.nextDouble();
        System.out.println("Enter the Operator(+,-,*,/):");
        char operator = sc.next().charAt(0);
        double result = 0.0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("invalid operator");
                break;
        }
        System.out.println(num1 + " " + operator + " " + num2 + "=" + result);
    }
}
