package com.javaObjects;

public class Grades {


    private String playWindow;
    private Student student;

    public Grades(String playWindow, Student student) {
        this.playWindow = playWindow;
        this.student = student;
    }

    public Grades() {

    }

    public String getPlayWindow() {
        return playWindow;
    }

    public void setPlayWindow(String playWindow) {
        this.playWindow = playWindow;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
