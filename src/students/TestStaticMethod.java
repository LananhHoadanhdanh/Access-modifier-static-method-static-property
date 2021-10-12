package students;

public class TestStaticMethod {
    public static void main(String[] args) {
        Students.change();
        Students student1 = new Students(111, "Chi Tử");
        Students student2 = new Students(222, "Dành Dành");
        Students student3 = new Students(333, "Meo Meo");

        student1.display();
        student2.display();
        student3.display();
    }
}



