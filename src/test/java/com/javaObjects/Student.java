package com.javaObjects;

public class Student {



    private int playWind;
    private int windowNet;
    private String inStartDate;
    private String inEndDate;
    private int[] grades;
    private int [] no_grades;


    public Student(int playWind, int windowNet, String inStartDate, String inEndDate, int[] grades, int[] no_grades) {
        this.playWind = playWind;
        this.windowNet = windowNet;
        this.inStartDate = inStartDate;
        this.inEndDate = inEndDate;
        this.grades = grades;
        this.no_grades = no_grades;

    }



    public Student() {
    }


    public int getPlayWind() {
        return playWind;
    }

    public void setPlayWind(int playWindowName) {
        this.playWind = playWind;
    }

    public int getWindowNet() {
        return windowNet;
    }

    public void setWindowNet(int windowNet) {
        this.windowNet = windowNet;
    }

    public String getinStartDate() {
        return inStartDate;
    }

    public void setinStartDate(String winStartDate) {
        this.inStartDate = inStartDate;
    }

    public String getinEndDate() {
        return inEndDate;
    }

    public void setinEndDate(String winEndDate) {
        this.inEndDate = inEndDate;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public int[] getNo_grades() {
        return no_grades;
    }

    public void setNo_grades(int[] no_grades) {
        this.no_grades = no_grades;
    }




}