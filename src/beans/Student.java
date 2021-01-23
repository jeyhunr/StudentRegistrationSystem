package beans;

public class Student {
    // instance variables
    private String name;
    private String surname;
    private int age;
    private String className;

    // constructors
    public Student() {
    }

    public Student(String name, String surname, int age, String className) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.className = className;
    }

    // getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getFullInfo (){
        return this.getName() + " " + this.getSurname() + " " + this.getAge() + " " + this.getClassName();
    }
}
