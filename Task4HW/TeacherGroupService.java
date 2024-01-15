package Task4HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeacherGroupService {
    TeacherGroup teacherGroup;
    public TeacherGroupService(TeacherGroup teacherGroup){
        this.teacherGroup = teacherGroup;
    }

    public void removeTeacherFIO(String firstName, String secondName, String lastName){
        TeacherGroupIterator iterator = new TeacherGroupIterator(teacherGroup);
        while (iterator.hasNext()){
            Teacher teacherItem = iterator.next();
            if (teacherItem.getFirstName().equals(firstName) && 
            teacherItem.getSecondName().equals(secondName) && 
            teacherItem.getLastName().equals(lastName)){
                iterator.remove();
            }
        }

    }

    public void soutTeacherGroup(){
        for (Teacher teacher : teacherGroup) {
            System.out.println(teacher);
        }
    }

    public List<Teacher> getSortedTeacherGroupById(){
        List<Teacher> teacherList = new ArrayList<>(teacherGroup.teacherList);
        Collections.sort(teacherList);
        return teacherList;
    }

    public List<Teacher> getSortedTeacherGroupByFIO(){
        List<Teacher> teacherList = new ArrayList<>(teacherGroup.teacherList);
        teacherList.sort(new UserComparator());
        return teacherList;
    }
}

