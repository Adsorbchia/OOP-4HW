package ru.gb.oseminar.data;

import ru.gb.oseminar.view.UserView;

import java.util.List;
import java.util.logging.Logger;

public class TeacherView implements UserView<Teacher>{
    Logger logger = Logger.getLogger(TeacherView.class.getName());


    public Teacher sendOnConsole(List<User> list) {
        return (Teacher) list.get(0);
    }
}
