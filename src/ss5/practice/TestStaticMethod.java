package ss5.practice;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(332, "Long");
        Student s3 = new Student(505, "Minh");

        s1.display();
        s2.display();
        s3.display();
    }
}
