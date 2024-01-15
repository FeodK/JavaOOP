package Task4HW;

public class TeacherController implements UserController<Teacher>{

    @Override
    public Teacher create(String firstName, String secondName, String lastName) {
        return new Teacher(0, firstName, secondName, lastName);
    }
    
}
