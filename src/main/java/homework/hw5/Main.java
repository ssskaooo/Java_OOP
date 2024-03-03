package homework.hw5;

import homework.hw5.controller.Controller;
import homework.hw5.model.Student;
import homework.hw5.model.StudyGroup;
import homework.hw5.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();

        // Создаем преподавателей
        Teacher teacher1 = new Teacher("Виктор", "Геннадьевич", "Улюляев", 1);
        Teacher teacher2 = new Teacher("Иван", "Петрович", "Ченуш", 2);

        // Создаем студентов
        controller.createStudent("Антон", "Антонович", "Антонов", 1);
        controller.createStudent("Петр", "Петрович", "Петров", 2);
        controller.createStudent("Семен", "Семенович", "Семенов", 3);
        controller.createStudent("Андрей", "Андреевич", "Андреев", 4);
        controller.createStudent("Иван", "Иванович", "Иваноч", 5);

        // Получаем список идентификаторов студентов
        List<Integer> studentIds = controller.getAllStudentIds();

        // Формируем учебные группы
        List<Student> students1 = new ArrayList<>();
        students1.add(new Student("Антон", "Антонович", "Антонов", 1));
        students1.add(new Student("Петр", "Петрович", "Петров", 2));
        StudyGroup studyGroup1 = controller.formStudyGroup(teacher1, students1);
        System.out.println(studyGroup1);

        List<Student> students2 = new ArrayList<>();
        students2.add(new Student("Семен", "Семенович", "Семенов", 3));
        students2.add(new Student("Андрей", "Андреевич", "Андреев", 4));
        students2.add(new Student("Иван", "Иванович", "Иваноч", 5));
        StudyGroup studyGroup2 = controller.formStudyGroup(teacher2, students2);
        System.out.println(studyGroup2);
    }
}
