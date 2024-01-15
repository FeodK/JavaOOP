package Task4;

import java.util.List;

public interface IUserView<T extends User> {
    void sendOnConsole(List<T> list);
}
