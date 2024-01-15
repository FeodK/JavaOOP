package Task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupService {
    StudentGroup studentGroup;
    public StudentGroupService(StudentGroup studentGroup){
        this.studentGroup = studentGroup;
    }

    public void removeStudentFIO(String firstName, String secondName, String lastName){
        StudentGroupIterator iterator = new StudentGroupIterator(studentGroup);
        while (iterator.hasNext()){
            Student studentItem = iterator.next();
            if (studentItem.getFirstName().equals(firstName) && 
            studentItem.getSecondName().equals(secondName) && 
            studentItem.getLastName().equals(lastName)){
                iterator.remove();
            }
        }

    }

    public void soutStudentGroup(){
        for (Student student : studentGroup) {
            System.out.println(student);
        }
    }

    public List<Student> getSortedStudentGroupById(){
        List<Student> studentList = new ArrayList<>(studentGroup.studentList);
        Collections.sort(studentList);
        return studentList;
    }

    public List<Student> getSortedStudentGroupByFIO(){
        List<Student> studentList = new ArrayList<>(studentGroup.studentList);
        studentList.sort(new UserComparator());
        return studentList;
    }
}

