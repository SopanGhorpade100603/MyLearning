import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number;
        System.out.println("Enter the Number");
        Number = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= Number; i++) {
            fact = fact * i;
        }
        System.out.println("factorial is" + fact);
    }
}
