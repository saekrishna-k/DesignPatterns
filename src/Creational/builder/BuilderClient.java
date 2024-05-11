package Creational.builder;

public class BuilderClient {
    public static void main(String[] args){
        Director director1 = new Director(new EngineeringStudentBuilder());
        Director director2 = new Director(new MBAStudentBuilder());

        Student engineeringStudent = director1.createStudent();
        Student mbaStudent = director2.createStudent();

        System.out.println(engineeringStudent);
        System.out.println(mbaStudent);
    }
}
