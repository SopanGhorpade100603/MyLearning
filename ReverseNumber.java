import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int r;
        String str = "";
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            str = str + r;
        }
        System.out.println(str);
    }
}
