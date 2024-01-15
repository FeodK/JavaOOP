package Task4;

public class Student extends User implements Comparable<Student>{
    int studenID;
    

    public Student(int studenID, String fitsName, String secondName, String lastName){
        super(fitsName, secondName, lastName);
        this.studenID = studenID;
    }

    @Override
    public String toString() {
        return "Student{" + "studentID=" + studenID + 
        ", firstName='" + super.getFirstName() + '\'' + 
        ", secondName='" + super.getSecondName() + '\'' + 
        ", lastName='" + super.getLastName() + '\'' + 
        '}';
    }

    @Override
    public int compareTo(Student o) {
        if (studenID > o.studenID) {
            return 1;
        }
        if (studenID < o.studenID) {
            return -1;
        }
        return 0;
    }

}
