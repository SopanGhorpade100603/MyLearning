import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        int Number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        Number = sc.nextInt();
        int m = Number;
        int sum = 0;
        int r;
        while (Number > 0) {
            r = Number % 10;
            Number = Number / 10;
            sum = sum + r * r * r;
                    }
if(sum==m)
System.out.println("the number is armstring number");
else
System.out.println("the number is not armstrong number");
    }
}
