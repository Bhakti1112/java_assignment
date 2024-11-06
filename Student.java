import java.io.*;
import java.util.*;

import org.w3c.dom.NameList;

public class Student {
    private int id;
    private String name;
    private int age;
    private String department;

    public Student(int id, String name, int age, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public int getStudentId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public String toString() {
        return "Student ID :" + id + "Name:" + name + '\'' + "Age:" + age + "Department :" + department + '\'';
    }
}