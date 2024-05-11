package Creational.prototype;

public class Professor implements Prototype{

    int age;
    String name;
    private String subject;
    private int rollNumber;

    public Professor() {
    }

    public Professor(int age, String name, String subject, int rollNumber) {
        this.age = age;
        this.name = name;
        this.subject = subject;
        this.rollNumber = rollNumber;
    }

    @Override
    public Prototype clone() {
        return new Professor(age,name,subject,rollNumber);
    }
}
