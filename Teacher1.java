package ru.gb.oseminar.data;

public class Teacher1 <T extends Teacher> extends Teacher{
    public Teacher1(String firstName, String secondName, String patronymic, String dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }
}
