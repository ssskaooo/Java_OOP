package homework.hw5.view;

import homework.hw5.model.Student;

import java.util.List;

public class StudentView implements IUserView<Student>{


    @Override
    public void PrintOnConsole(Student user) {
        System.out.println(user);
    }

    @Override
    public void PrintOnConsoleArr(List<Student> users) {
        for (Student student : users) {
            System.out.println(student);
        }
    }
}
