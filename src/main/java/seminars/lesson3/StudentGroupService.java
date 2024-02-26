package seminars.lesson3;

import java.util.*;

public class StudentGroupService {

    StudentGroup studentGroup;

    public StudentGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public List<Student> getSortedStudentGroup() {
        List<Student> studentList = new ArrayList<> (studentGroup.studentList);
        Collections.sort(studentList);
        return studentList;
    }

    public List<Student> getSortedStudentGroupByFIO() {
        List<Student> studentList = new ArrayList<> (studentGroup.studentList);
        studentList.sort(new StudentComparator());
        return studentList;
    }
}
