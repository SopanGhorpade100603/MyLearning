import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num1, Num2, add;
        System.out.println("Enter the value of Num1&num2");
        Num1 = sc.nextInt();
        Num2 = sc.nextInt();
        add = Num1 + Num2;
        System.out.println("the sum of "+add);
    }
}
