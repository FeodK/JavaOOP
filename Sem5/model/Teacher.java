package Sem5.model;

public class Teacher extends User{
    private int teacherId;
    public Teacher(String fitsName, String secondName, String lastName, int teacherId) {
        super(fitsName, secondName, lastName);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return this.teacherId;
    }


    @Override
    public String toString() {
        return "Teacher{" +
            " teacherId='" + getTeacherId() + "'" +
            " firstName='" + getFirstName() + "'" +
            ", secondName='" + getSecondName() + "'" +
            ", lastName='" + getLastName() + "'" +
            "}";
    }
    

}
