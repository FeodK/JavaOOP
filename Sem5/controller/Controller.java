package Sem5.controller;

import java.util.List;

import Sem5.model.Student;
import Sem5.model.Teacher;
import Sem5.service.DataService;
import Sem5.service.Type;
import Sem5.view.StudentView;
import Sem5.view.TeacherView;

public class Controller {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView = new TeacherView();

    public void createStudent(String firstName, String secondName, String lastName){
        service.create(firstName, secondName, lastName, Type.STUDENT);
    }
    public void createTeacher(String firstName, String secondName, String lastName){
        service.create(firstName, secondName, lastName, Type.TEACHER);
    }
    public void getAllStudent(){
        List<Student> studentList = service.getAllStudent();
        for (Student student : studentList) {
            studentView.printOnConsole(student);
        }
    }
    public void getAllTeacher(){
        List<Teacher> teachertList = service.getAllTeacher();
        for (Teacher teacher : teachertList) {
            teacherView.printOnConsole(teacher);
        }
    }
}
