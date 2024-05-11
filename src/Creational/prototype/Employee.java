package Creational.prototype;

public class Employee implements Prototype {
    int age;
    private int rollNumber;
    String name;

    public Employee() {
    }

    public Employee(int age, int rollNumber, String name) {
        this.age = age;
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new Employee(age, rollNumber, name);
    }
}