package Creational.builder;

public class Director {
    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if (studentBuilder instanceof EngineeringStudentBuilder) {
            return createEngineeringStudent();
        } else if (studentBuilder instanceof MBAStudentBuilder) {
            return createMBAStudent();
        }
        return null;
    }
    private Student createEngineeringStudent(){
        return studentBuilder.setRollNumber(1).setAge(21).setName("Raj").setSubjects().build();
    }
    private Student createMBAStudent(){
        return studentBuilder.setRollNumber(3).setAge(25).setName("Ram").setFatherName("Dasarad").setSubjects().build();
    }
}
