package homework.hw5.service;

import homework.hw5.model.Student;
import homework.hw5.model.StudyGroup;
import homework.hw5.model.Teacher;

import java.util.List;

public class StudyGroupService {

    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        return new StudyGroup(teacher, students);
    }
}
