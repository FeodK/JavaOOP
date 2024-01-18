package Sem5.service;

import java.util.ArrayList;
import java.util.List;

import Sem5.model.Student;
import Sem5.model.Teacher;
import Sem5.model.User;

public class DataService {
    private List<User> userList;

    public DataService() {
        this.userList = new ArrayList<>();
    }

    public void create(String fitstName, String secondName, String lastName, Type type){
        User user = null;
        int id = getFreeId(type);
        if(Type.STUDENT == type){
            user = new Student(fitstName, secondName, lastName,id);
        }
        if (Type.TEACHER == type) {
            user = new Teacher(fitstName, secondName, lastName, id);
        }
        userList.add(user);
    }
    private int getFreeId(Type type){
        boolean isStudent = Type.STUDENT == type;
        int lastId = 1;
        for (User user : userList) {
            if (user instanceof Teacher && !isStudent) {
                lastId = ((Teacher)user).getTeacherId() + 1;
            }
            if (user instanceof Student && isStudent) {
                lastId = ((Student)user).getStudentId() + 1;
                
            }
        }
        return lastId;
    }
    public List<User> getAllUser(){
        return userList;
    }

    public List<Student> getAllStudent(){
        List<Student> resultList = new ArrayList<>();
        for(User user : userList){
            if (user instanceof Student){
                resultList.add((Student)user);
            }
        }
        return resultList;
    }
    public List<Teacher> getAllTeacher(){
        List<Teacher> resultList = new ArrayList<>();
        for(User user : userList){
            if (user instanceof Teacher){
                resultList.add((Teacher)user);
            }
        }
        return resultList;
    }
}
