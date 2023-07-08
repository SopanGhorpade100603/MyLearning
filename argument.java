public class argument {
    static void show (int...a){
        // for(int x:a){
        //     System.out.println(x);
        // }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        show();
        show(10,20,30);
        show(new int []{3,5,7,9,11,13,15});
    }
}
