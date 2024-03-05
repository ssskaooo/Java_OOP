package seminars.lesson5.view;

import seminars.lesson5.model.User;

import java.util.List;

public interface IUsersView <T extends User>{

    public void printConsole(T user);

    public void printConsoleArr(List<T> users);
}
