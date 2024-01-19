package S5HW.controller;

import S5HW.Data.Type;
import S5HW.Data.User;
import S5HW.Data.Student;
import S5HW.Data.StudyGroup;
import S5HW.Data.Teacher;
import S5HW.service.DataService;
import S5HW.service.StudyGroupService;
import S5HW.view.StudentView;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();
    public Controller(){}

    public void createStudent(String firstName, String secondName,
                              String lastName, String dateB){
        service.create(firstName,secondName,lastName,dateB, Type.STUDENT);
    }

    public void getAllStudent(){
        List<User> userList = service.getAllStudent();
        for (User user: userList){
            studentView.printOnConsole((Student) user);
        }
    }
    StudyGroupService studyGroupService;

    public Controller(StudyGroupService studyGroupService) {
        this.studyGroupService = studyGroupService;
    }

    public List<Integer> getStudentIds(List<Student> students) {
        List<Integer> studentIds = new ArrayList<>();
        for (Student student : students) {
            studentIds.add(student.getStudentId());
        }
        return studentIds;
    }

    public int getTeacherId(Teacher teacher) {
        return teacher.getTeacherId();
    }

    public StudyGroup createStudyGroupFromData(Teacher teacher, List<Student> students) {
        int teacherId = getTeacherId(teacher);
        List<Integer> studentIds = getStudentIds(students);

        // вызываем метод из сервиса для формирования учебной группы
        return studyGroupService.createStudyGroup(teacher, students);
    }
}
