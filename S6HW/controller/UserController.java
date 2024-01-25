package S6HW.controller;

import java.time.LocalDate;

import S6HW.data.User;

public interface UserController<T extends User>{
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}