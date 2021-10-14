package com.agileexlab;
import com.agileexlab.school.Student;

public class Main {
    public static void main(String[] arg){
        Student student = new Student("vincent", 25, "male", 001);
        System.out.println("Student Name:" + student.getName());
        System.out.println("Student Age:" + student.getAge());
        System.out.println("Student Gender:" + student.getGender());
        System.out.println("Student ID:" + student.getId());
    }
}
