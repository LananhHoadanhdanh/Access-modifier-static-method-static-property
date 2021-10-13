package hoc_sinh;

public class HocSinh {
    private String name;
    private String classes;
    HocSinh() {
        name = "John";
        classes = "C02";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "HocSinh {" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
