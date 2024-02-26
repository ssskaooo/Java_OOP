package seminars.lesson3;

import seminars.lesson4.StudentView;
import seminars.lesson4.UserView;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(4, "Max","Max2","Max3" );
        Student student2 = new Student(3, "Viktor","Viktor2","Viktor3" );
        Student student3 = new Student(2, "Egor","Egor2","Egor3" );
        Student student4 = new Student(1, "Andry","Andry2","Andry3" );

        List<Student> studentList = new ArrayList<>();
        StudentGroup studentGroup = new StudentGroup(studentList);

        studentGroup.addStudent(student1);
        studentGroup.addStudent(student2);
        studentGroup.addStudent(student3);
        studentGroup.addStudent(student4);


        StudentGroupService service = new StudentGroupService(studentGroup);
        UserView<Student> view = new StudentView();
        view.sendOnConsole(service.getSortedStudentGroupByFIO());
    }
}
