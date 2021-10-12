package students;

class Students {
    private int rollNo;
    private String name;
    private static String college = "NEU";

    public Students(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    static void change() {
        college = "CODEGYM";
    }

    void display() {
        System.out.println(this.rollNo + " " + this.name + " " + college);
    }
}

