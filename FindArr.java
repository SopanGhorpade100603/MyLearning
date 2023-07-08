import java.util.Scanner;

public class FindArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 10, 25, 12, 45, 65, 30, 40, 100, 78, 99 };

        int key;
        System.out.println("Enter the key");
        key = sc.nextInt();
        for (int i = 0; i < arr.length; i++)
            if (key == arr[i])
                System.out.println("Key found at" + i);
        System.exit(0);
        System.out.println("Envalid Key");
    }
}
