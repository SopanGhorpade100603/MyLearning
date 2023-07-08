public class overloading {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

   // class TestOveerloading {
        public static void main(String[] args) {
            System.out.println(overloading.add(11, 11));
            System.out.println(add(11, 11, 11));
        }
    }

//}
