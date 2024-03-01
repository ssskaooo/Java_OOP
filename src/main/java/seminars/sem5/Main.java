package seminars.sem5;

import seminars.sem5.controller.Controller;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("1","1", "1");
        controller.createStudent("2","2", "2");
        controller.getAllStudent();
        System.out.println();
        controller.createStudent("3","3", "3");
        controller.createStudent("4","4", "4");
        controller.getAllStudent();

    }
}
