package com.company;

import java.util.Objects;

public class Subject extends HumanAbstract  implements Comparable<Subject>{
    String name;
    boolean isNormative;
    int hours;
    boolean isExam;
    private  OKR okr;

    public enum OKR {
        master,
        bachelor,
        specialist};


    public Subject(){}



    public Subject(String name, boolean isNormative, int hours, boolean isExam, OKR okr){

        this.setName(name);
        this.setNormative(isNormative);
        this.setHours(hours);
        this.setExam(isExam);
        this.setOkr(okr);
    }


    //////////////////////////////////////////////////////////////////////////////
    @Override
    public String toString() {
        return "subject: " + this.getName() + ", isNormative: "
                + this.isNormative + ", hours: " + this.getHours() + ", isExam: " + this.isExam()
                + ", OKR: " + this.getOkr();
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, isNormative, hours, isExam, okr);
    }

    @Override
    public boolean equals(Object o){
        if(o == this) return true;
        if(!(o instanceof Subject )){
            return false;
        }

        Subject subject = (Subject) o;
        return name == subject.name &&
                Objects.equals(name, subject.name) &&
                Objects.equals(isNormative, subject.isNormative) &&
                Objects.equals(hours, subject.hours) &&
                Objects.equals(isExam, subject.isExam) &&
                Objects.equals(okr, subject.okr);
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Subject cloneSubject = new Subject();
        cloneSubject.name = this.name;
        cloneSubject.isNormative = this.isNormative;
        cloneSubject.hours = this.hours;
        cloneSubject.isExam = this.isExam;
        cloneSubject.okr = this.okr;
        return cloneSubject;
    }



    @Override
    public int compareTo(Subject subject){

        return hours >= subject.hours ? -1:1;

    }

    //////////////////////////////////////////////////////////////////////////////




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNormative() {
        return isNormative;
    }

    public void setNormative(boolean normative) {
        isNormative = normative;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public boolean isExam() {
        return isExam;
    }

    public void setExam(boolean exam) {
        isExam = exam;
    }

    public OKR getOkr() {
        return okr;
    }

    public void setOkr(OKR okr) {
        this.okr = okr;
    }
}
