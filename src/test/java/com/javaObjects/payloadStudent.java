package com.javaObjects;

public class payloadStudent {

    private Student play;
    private boolean propogate;


    public payloadStudent(Student student, boolean propogate) {
        this.play = student;
        this.propogate = propogate;

    }

    public Student getPlayWindow() {
        return play;
    }

    public void setPlayWindow(Student playWindow) {
        this.play = playWindow;
    }

    public boolean isPropogate() {
        return propogate;
    }

    public void setPropogate(boolean propogate) {
        this.propogate = propogate;
    }
}