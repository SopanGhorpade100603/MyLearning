public class AreaOfCir {
    public double redius;

    public double area() {
        return Math.PI * redius * redius;
    }

    public double perimeters() {
        return 2 * Math.PI * redius;
    }

    public double circumference() {
        return perimeters();
    }

    public static void main(String[] args) {
        AreaOfCir c = new AreaOfCir();
        c.redius = 7;
        System.out.println("area :" + c.area());
        System.out.println("perimeter :" + c.perimeters());
        System.out.println("circumference:" + c.circumference());

    }
}
