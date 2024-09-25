package org.example.git;

import java.util.Locale;

public class Student {
    private int id;
    private String name;
    private String lastname;
    private String birthday;
    private String hobby;
    private int count;



    public Student(String name, String lastname, String birthday, String hobby) {
        this.name = name;
        this.lastname = lastname;
        this.birthday = birthday;
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return id+ " - Student{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthday='" + birthday + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
