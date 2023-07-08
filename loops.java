import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int Number;
       System.out.println("Enter the Number if you want to print the table");
       Number =sc.nextInt();
       for(int i=1;i<=10;i++){
        System.out.println(Number * i);
       }

    }

}
