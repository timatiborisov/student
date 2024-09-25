package org.example.git;


import java.util.ArrayList;
import java.util.List;

public class StudentService {
    List<Student> students = new ArrayList<>();
    private int size;
//    getAll();
//    update();
//    delete();


    public boolean add(String name, String lastname, String birthday, String hobby){
        students.add(new Student(name,lastname,birthday,hobby));
        size++;
        return true;
    }

    public void get(int index){
        System.out.println(index+1 + " - index = " + students.indexOf(index + 1));
    }


}
