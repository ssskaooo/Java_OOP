package seminars.lesson3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(1, "Max","Max2","Max3" );
        Student student2 = new Student(2, "Viktor","Viktor2","Viktor3" );
        Student student3 = new Student(3, "Egor","Egor2","Egor3" );
        Student student4 = new Student(4, "Andry","Andry2","Andry3" );



        List<Student> studentList = new ArrayList<>();
        StudentGroup studentGroup = new StudentGroup(studentList);

        studentGroup.addStudent(student1);
        studentGroup.addStudent(student2);
        studentGroup.addStudent(student3);
        studentGroup.addStudent(student4);


        for (Student student : studentGroup) {
            System.out.println(student);
        }
    }
}
