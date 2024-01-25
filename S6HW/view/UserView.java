package S6HW.view;

import java.util.List;

import S6HW.data.User;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}