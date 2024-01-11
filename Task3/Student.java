package Task3;

public class Student implements Comparable<Student>{
    int studenID;
    String firstName;
    String secondName;
    String lastName;

    public Student(int studenID, String fitsName, String secondName, String lastName){
        this.studenID = studenID;
        this.firstName = fitsName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" + "studentID=" + studenID + 
        ", firstName='" + firstName + '\'' + 
        ", secondName='" + secondName + '\'' + 
        ", lastName='" + lastName + '\'' + 
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
