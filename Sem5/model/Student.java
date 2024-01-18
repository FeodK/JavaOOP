package Sem5.model;

public class Student extends User{
    private int studentId;
    public Student(String fitsName, String secondName, String lastName, int studentId) {
        super(fitsName, secondName, lastName);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return this.studentId;
    }


    @Override
    public String toString() {
        return "Student{" +
            " studentId='" + getStudentId() + "'" +
            " firstName='" + getFirstName() + "'" +
            ", secondName='" + getSecondName() + "'" +
            ", lastName='" + getLastName() + "'" +
            "}";
    }
    

}
