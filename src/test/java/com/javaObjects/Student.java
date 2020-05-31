package com.javaObjects;

public class Student {


    /*
      "playWindow": {
            "playWindowNo": 0,
                    "windowNetwork": 246,
                    "winStartDate": "2020-05-28T00:00:00.000Z",
                    "winEndDate": "2020-05-31T00:00:00.000Z",
                    "operationType": "Create",
                    "tierAvailabilityNo": [
            14,
                    15,
                    16
        ],
            "seasonGroupTitleNo": []
        },
                "propagate": true
    }*/
    private int playWindowName;
    private int windowNetwork;
    private String winStartDate;
    private String winEndDate;
    private int[] grades;
    private int [] no_grades;


    public Student(int playWindowName, int windowNetwork, String winStartDate, String winEndDate, int[] grades, int[] no_grades) {
        this.playWindowName = playWindowName;
        this.windowNetwork = windowNetwork;
        this.winStartDate = winStartDate;
        this.winEndDate = winEndDate;
        this.grades = grades;
        this.no_grades = no_grades;

    }



    public Student() {
    }


    public int getPlayWindowName() {
        return playWindowName;
    }

    public void setPlayWindowName(int playWindowName) {
        this.playWindowName = playWindowName;
    }

    public int getWindowNetwork() {
        return windowNetwork;
    }

    public void setWindowNetwork(int windowNetwork) {
        this.windowNetwork = windowNetwork;
    }

    public String getWinStartDate() {
        return winStartDate;
    }

    public void setWinStartDate(String winStartDate) {
        this.winStartDate = winStartDate;
    }

    public String getWinEndDate() {
        return winEndDate;
    }

    public void setWinEndDate(String winEndDate) {
        this.winEndDate = winEndDate;
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