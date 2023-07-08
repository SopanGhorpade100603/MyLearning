public class methodoverloading {
    static int add(int x, int y) {
        return x + y;
    }

    static int div(int x, int y, int z) {
        return x + y - z;
    }

    public static void main(String[] args) {
        System.out.println(add(10, 20));
        System.out.println(div(20, 30, 14));
    }
}
