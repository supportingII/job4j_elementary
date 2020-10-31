package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Slava");
        student.setSurname("Pupkin");
        student.setPatronymic("Ivanovich");
        student.setGroup(8);
        student.setDateReceipt(new Date());
    }
}
