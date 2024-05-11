package Creational.prototype;

/*
 *   PROTOTYPE DESIGN PATTERN:
 *   =========================
 *   It is used when we have to make copy/clone from the existing object and
 *   creation of that object is very expensive.
 *
 *   Problem:
 *   ========
 *   1. When we are trying to clone student object by below approach,we can't access the private members
 *   out of the class and even get methods are private.
 *
 *   2. The Client which creating the clone objects need to know about the Student class, which fields to
 *   be copied and which fields can be left.
 *
 *   Solution:
 *   =========
 *   The solution is client should not take the responsibility of cloning an object.It should be the
 *   responsibility of the class itself(Student.class).
 *   We have used a Prototype Interface to declare a clone() method which the classes will implement the
 *   Prototype interface to define clone() method according to their requirement and to maintain consistency
 *   across all the classes.
 *
 *
 * */

public class PrototypeClient {
    public static void main(String[] args){
        Student originalStudentObject = new Student(27,97,"Ram");

        //creating clone of originalStudentObject object
        Student clonedStudent = new Student();
        clonedStudent.age = originalStudentObject.age;
        clonedStudent.name = originalStudentObject.name;
        //studentClone.rollNumber = originalStudentObject.rollNumber;

        Employee employee = new Employee(25,27,"Sita");
        //creating clone of Employee object
        Employee clonedEmployee = (Employee) employee.clone();

    }
}
