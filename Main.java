package ru.gb.oseminar.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
    TeacherService<Teacher> listTeaches = new TeacherService<>();
    listTeaches.addTeacher(new Teacher("Ирина", "Олеговна", "Иванова", "05.08.88"));
    listTeaches.addTeacher(new Teacher("Ольга", "Игоревна", "Петрова", "05.09.88"));
    listTeaches.addTeacher(new Teacher("Мария", "Ивановна", "Сидорова", "11.12.83"));
    listTeaches.printTeacher();
    TeacherView teacherView = new TeacherView();
    System.out.println(teacherView.sendOnConsole(List.of( new Teacher<>("Ирина", "Олеговна", "Иванова", "05.08.88"))));


    }
}
