package seminars.sem5.service;

import seminars.sem5.model.Student;
import seminars.sem5.model.Teacher;
import seminars.sem5.model.TypeUser;
import seminars.sem5.model.User;

import java.util.ArrayList;
import java.util.List;

public class DateService {

    List<User> users = new ArrayList<>();

    public void create(String firstName, String secondName, String lastName, TypeUser type) {
        int id = getFreeId(type);
        if (type == TypeUser.STUDENT) {
            users.add(new Student(firstName, secondName, lastName, id));
        } else if (type == TypeUser.TEACHER) {
            users.add(new Teacher(firstName, secondName, lastName, id));
        }
    }

    private int getFreeId(TypeUser typeUser) {
        for (int i = users.size() - 1; i >= 0; i--) {
            User user = users.get(i);
            if (user instanceof Student && typeUser == TypeUser.STUDENT)
                return ((Student) user).getStudentId() + 1;
            if (user instanceof Teacher && typeUser == TypeUser.TEACHER)
                return ((Teacher) user).getTeacherId() + 1;
        }
        return 1;
    }

    public List<Student> getAllStudent() {
        List<Student> students = new ArrayList<>();
        for (User user : users) {
            students.add((Student) user);
        }
        return students;
    }
}
