package S5HW.Data;

import java.util.List;

public class StudyGroup {
    public Teacher teacher;
    public List<Student> students;

    public StudyGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }
    
}
