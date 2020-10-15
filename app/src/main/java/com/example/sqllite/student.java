package com.example.sqllite;

public class student {
    private int sID;
    private String sName,sCourses,sSem;
    public student()
    {

    }
    public student(String sName, String sCourses, String sSem) {
        this.sName = sName;
        this.sCourses = sCourses;
        this.sSem = sSem;
    }

    public student(int sID, String sName, String sCourses, String sSem) {
        this.sID = sID;
        this.sName = sName;
        this.sCourses = sCourses;
        this.sSem = sSem;
    }

    public int getsID() {
        return sID;
    }

    public void setsID(int sID) {
        this.sID = sID;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsCourses() {
        return sCourses;
    }

    public void setsCourses(String sCourses) {
        this.sCourses = sCourses;
    }

    public String getsSem() {
        return sSem;
    }

    public void setsSem(String sSem) {
        this.sSem = sSem;
    }


}
