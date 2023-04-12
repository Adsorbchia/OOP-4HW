package ru.gb.oseminar.data;

import ru.gb.oseminar.service.UserService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeacherService <T extends Teacher>{
    public TeacherService() {
        this.teachers =new ArrayList<>();
    }

    private List <T> teachers;

    public void addTeacher(T item){
        teachers.add(item);
    }
    public void printTeacher(){
        Iterator iterator= teachers.iterator();
        while (iterator.hasNext()){
            Teacher el = (Teacher) iterator.next();
            System.out.println(el);
        }
    }

    @Override
    public String toString() {
        return "TeacherService{" +
                "teachers=" + teachers +
                '}';
    }

}
