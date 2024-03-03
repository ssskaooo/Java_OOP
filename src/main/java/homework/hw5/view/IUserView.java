package homework.hw5.view;

import homework.hw5.model.User;

import java.util.List;

public interface IUserView <T extends User>{

    public void PrintOnConsole(T user);
    public void PrintOnConsoleArr(List<T> users);

}
