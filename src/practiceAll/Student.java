package practiceAll;

public class Student {
    private int id;
    private String name;
    private boolean gender;
    private String className;


    public Student() {
    }

    public Student(int id, String name, boolean gender, String className) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.className = className;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", className='" + className + '\'' +
                '}';
    }
}

