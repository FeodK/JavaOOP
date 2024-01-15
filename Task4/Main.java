package Task4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentController controller = new StudentController();
        System.out.println(controller.create("asd", "sdw", "dsd"));
        test(controller.create("asd", "sdw", "dsd"));
        // Student student1 = new Student(4, "aab", "aab", "aab");
        // Student student2 = new Student(2, "aaa", "aaa", "aaa");
        // Student student3 = new Student(3, "Aaa", "Aaa", "Aaa");
        // Student student4 = new Student(1, "bbb", "bbb", "bbb");
        // List<Student> studentList = new ArrayList<>();
        // StudentGroup studentGroup = new StudentGroup(studentList);
        // studentGroup.studentList.add(student1);
        // studentGroup.studentList.add(student2);
        // studentGroup.studentList.add(student3);
        // studentGroup.studentList.add(student4);
        // StudentGroupService service = new StudentGroupService(studentGroup);
        // service.soutStudentGroup();
        // System.out.println();
        // for (Student student : service.getSortedStudentGroupById()) {
        //     System.out.println(student);
        // }
        // System.out.println();
        // for (Student student : service.getSortedStudentGroupByFIO()) {
        //     System.out.println(student);
        // }
        // StudentGroupIterator iterator = new StudentGroupIterator(studentGroup);
        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }
    }
    public static void test(User userView){};
}
