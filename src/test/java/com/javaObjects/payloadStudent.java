package com.javaObjects;

public class payloadStudent {

    private Student playWindow;
    private boolean propogate;


    public payloadStudent(Student student, boolean propogate) {
        this.playWindow = student;
        this.propogate = propogate;

    }

    public Student getPlayWindow() {
        return playWindow;
    }

    public void setPlayWindow(Student playWindow) {
        this.playWindow = playWindow;
    }

    public boolean isPropogate() {
        return propogate;
    }

    public void setPropogate(boolean propogate) {
        this.propogate = propogate;
    }
}