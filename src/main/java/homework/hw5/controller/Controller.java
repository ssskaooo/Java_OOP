package homework.hw5.controller;

import homework.hw5.model.Student;
import homework.hw5.model.StudyGroup;
import homework.hw5.model.Teacher;
import homework.hw5.service.DataService;
import homework.hw5.service.StudyGroupService;

import java.util.List;

public class Controller {

    private DataService dataService = new DataService();
    private StudyGroupService studyGroupService = new StudyGroupService();

    public void createStudent(String firstName, String secondName, String lastName, int studentId) {
        dataService.createStudent(firstName, secondName, lastName, studentId);
    }

    public List<Integer> getAllStudentIds() {
        return dataService.getAllStudentIds();
    }

    public StudyGroup formStudyGroup(Teacher teacher, List<Student> students) {
        return studyGroupService.createStudyGroup(teacher, students);
    }
}
