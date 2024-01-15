package Task4HW;

import java.util.Iterator;
import java.util.List;

public class TeacherGroup implements Iterable<Teacher>{
    List<Teacher> teacherList;
    public TeacherGroup(List<Teacher> teacherList){
        this.teacherList = teacherList;
    }
    @Override
    public Iterator<Teacher> iterator() {
        return new TeacherGroupIterator(this);
    }

}
