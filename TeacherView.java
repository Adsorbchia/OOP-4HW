package ru.gb.oseminar.data;

import ru.gb.oseminar.view.UserView;

import java.util.List;
import java.util.logging.Logger;

public class TeacherView<T extends Teacher> {
    Logger logger = Logger.getLogger(TeacherView.class.getName());


    public Teacher sendOnConsole(List<Teacher> list) {
        return list.get(0);
    }
}
