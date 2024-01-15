package Task4;

public class StudentController implements UserController<Student>{

    @Override
    public Student create(String firstName, String secondName, String lastName) {
        return new Student(0, firstName, secondName, lastName);
    }
    
}
