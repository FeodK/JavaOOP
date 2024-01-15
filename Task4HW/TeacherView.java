package Task4HW;

import java.util.List;

public class TeacherView implements UserView<Teacher>{

    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher student : list) {
            System.out.println(student);
        }
    }
    
}
