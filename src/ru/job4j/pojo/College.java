package ru.job4j.pojo;

import java.util.Calendar;
import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Кожевников Иван Михайлович");
        student.setGroup("Стажёр");
        student.setDateOfReceipt(new Date(2020, Calendar.NOVEMBER, 25, 11, 45, 15));
        System.out.println(student.getFullName() + System.lineSeparator()
                + student.getGroup() + System.lineSeparator() +  student.getDateOfReceipt());

    }
}
