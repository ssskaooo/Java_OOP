package seminars.lesson5.controller;

import seminars.lesson5.model.TypeUser;
import seminars.lesson5.service.DateService;
import seminars.lesson5.view.StudentView;

public class Controller {

    DateService dateService = new DateService();
    StudentView studentView = new StudentView();

    public void createStudent(String firstName, String secondName, String lastName){
        dateService.create(firstName, secondName, lastName, TypeUser.STUDENT);
    }

    public void getAllStudent(){
        studentView.printConsoleArr(dateService.getAllStudent());
    }

}
