package homework.hw4;

import java.util.List;

public interface UserView<T extends User> {
    void sendOnConsole(List<T> list);
}
