package seminars.lesson4;

import seminars.lesson3.Student;

import java.util.List;

public class StudentView implements UserView<Student> {


    public void sendOnConsole(List<Student> list) {
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
