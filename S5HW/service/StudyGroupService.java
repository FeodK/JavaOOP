package S5HW.service;

import java.util.List;

import S5HW.Data.Student;
import S5HW.Data.StudyGroup;
import S5HW.Data.Teacher;

public class StudyGroupService {
    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        return new StudyGroup(teacher, students);
}
}