import java.util.Scanner;

public class APSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a,b,c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ap = a;
        for (int i = 0; i <= c; i++) {
            System.out.print(ap + ",");
            ap = ap + b;

        }
    }
}
