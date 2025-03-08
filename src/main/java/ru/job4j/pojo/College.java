package ru.job4j.pojo;

import java.util.Calendar;
import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student s001 = new Student();
        s001.setName("Ахмеров Ильфат Хакимович");
        s001.setGroupNumber("R1986");
        s001.setAdmissionDate(new Date(86, Calendar.AUGUST, 1));
        String ln = System.lineSeparator();
        System.out.println("Student: " + s001.getName() + ln
                + "group number:" + s001.getGroupNumber() + ln
                + "admission at " + s001.getAdmissionDate());
    }
}
