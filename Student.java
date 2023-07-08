class Student {
    public int roll;
    public String name;
    public String course;
    public int m1, m2, m3;

    public int total() {
        return m1 + m2 + m3;
    }

    public float average() {
        return (float) total() / 3;
    }

    public char grade() {
        if (average() > 60)
            return 'A';
        else
            return 'B';
    }

    public String details() {
        return "roll no :" + roll + "\n" + "name :" + name + "\n" + "course :" + course + "\n";
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.roll = 1;
        s.name = "Sopan";
        s.course = "math";
        s.m1 = 80;
        s.m2 = 88;
        s.m3 = 90;
        System.out.println("total:" + s.total());
        System.out.println("average:" + s.average());
        System.out.println("details:" + s.details());
    }

}
