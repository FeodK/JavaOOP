package Task4HW;

public class Main {
    public static void main(String[] args) {
        TeacherController controller = new TeacherController();
        System.out.println(controller.create("asd", "sdw", "dsd"));
        test(controller.create("Tda", "adW", "Tyh"));
    }
    public static void test(User userView){};
}
