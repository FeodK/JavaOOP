package S5HW;

import java.util.ArrayList;
import java.util.List;

import S5HW.Data.Student;
import S5HW.Data.StudyGroup;
import S5HW.Data.Teacher;
import S5HW.controller.Controller;
import S5HW.service.StudyGroupService;

public class Main {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("a", "a", "a", "a", 101);
        List<Student> students1 = new ArrayList<>();
        students1.add(new Student("1", "1","1","1", 1));
        students1.add(new Student("2", "2","2","2", 2));
        students1.add(new Student("3", "3","3","3", 3));

        StudyGroupService studyGroupService = new StudyGroupService();
        Controller controller = new Controller(studyGroupService);

        StudyGroup group1 = controller.createStudyGroupFromData(teacher1, students1);
        
        System.out.println("Study Group 1:");
        System.out.println("Teacher ID: " + controller.getTeacherId(group1.teacher));
        System.out.println("Student IDs: " + controller.getStudentIds(group1.students));
        System.out.println();

        Teacher teacher2 = new Teacher("aa", "aa", "aa", "aa", 102);
        List<Student> students2 = new ArrayList<>();
        students2.add(new Student("4", "4","4","4", 4));
        students2.add(new Student("5", "5","5","5", 5));
        students2.add(new Student("6", "6","6","6", 6));

        StudyGroup group2 = controller.createStudyGroupFromData(teacher2, students2);

        System.out.println();
        System.out.println("Study Group 2:");
        System.out.println("Teacher ID: " + controller.getTeacherId(group2.teacher));
        System.out.println("Student IDs: " + controller.getStudentIds(group2.students));
    }

    }
