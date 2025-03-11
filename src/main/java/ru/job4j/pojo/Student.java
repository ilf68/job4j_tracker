package ru.job4j.pojo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Student {
    private String name;
    private String groupNumber;
    public Date admissionDate;
    private static final DateTimeFormatter FORMATTER
            = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy");

    public String getName() {
        return name;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public void setName(String name) {
        this.name = name;    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }
}
