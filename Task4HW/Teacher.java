package Task4HW;

public class Teacher extends User implements Comparable<Teacher>{
    int teacherID;
    

    public Teacher(int teacherID, String fitsName, String secondName, String lastName){
        super(fitsName, secondName, lastName);
        this.teacherID = teacherID;
    }

    @Override
    public String toString() {
        return "Teacher{" + "teacherID=" + teacherID + 
        ", firstName='" + super.getFirstName() + '\'' + 
        ", secondName='" + super.getSecondName() + '\'' + 
        ", lastName='" + super.getLastName() + '\'' + 
        '}';
    }

    @Override
    public int compareTo(Teacher o) {
        if (teacherID > o.teacherID) {
            return 1;
        }
        if (teacherID < o.teacherID) {
            return -1;
        }
        return 0;
    }

}
