package seminars.lesson5.view;

import seminars.lesson5.model.Student;

import java.util.List;

public class StudentView implements IUsersView<Student>{
    @Override
    public void printConsole(Student user) {
        System.out.println(user);
    }

    @Override
    public void printConsoleArr(List<Student> users) {
        for (Student user : users) {
            System.out.println(user);
        }
    }

}
