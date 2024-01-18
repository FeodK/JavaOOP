package Sem5;

import Sem5.controller.Controller;

public class Main {

    public static void main(String[] args) {
        Controller controler = new Controller();
        controler.createStudent("1", "1","1");
        controler.createStudent("2", "2","2");
        controler.getAllStudent();
        System.out.println();
        controler.createStudent("3", "3","3");
        controler.createStudent("4", "4","4");
        controler.getAllStudent();
        System.out.println();
        controler.createTeacher("a", "a", "a");
        controler.createTeacher("b", "b", "b");
        controler.getAllTeacher();

    }
}
