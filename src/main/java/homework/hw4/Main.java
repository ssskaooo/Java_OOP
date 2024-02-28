package homework.hw4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(5, "Vitalii", "Birukov", "Gennadievich");
        Teacher teacher2 = new Teacher(2, "Sokolova", "Anastasia", "Fndreevna");
        Teacher teacher3 = new Teacher(3, "Solopova", "Tatiana", "Mihailovna");
        Teacher teacher4 = new Teacher(1, "Orlov", "Maxim", "Ivanovuch");
        Teacher teacher5 = new Teacher(4, "Petrov", "Ivan", "Ivanivich");
        List<Teacher> teacherList = new ArrayList<>();
        TeacherGroup teacherGroup = new TeacherGroup(teacherList);
        TeacherGroup.addTeacher(teacher1);
        TeacherGroup.addTeacher(teacher2);
        TeacherGroup.addTeacher(teacher3);
        TeacherGroup.addTeacher(teacher4);
        TeacherGroup.addTeacher(teacher5);

        TeacherGroupService service = new TeacherGroupService(teacherGroup);
        UserView<Teacher> view = new TeacherView();
        view.sendOnConsole(service.getSortedStudentGroupByFSL());
    }
}
