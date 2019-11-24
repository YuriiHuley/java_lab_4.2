package com.company;

import java.util.Objects;

public class Student extends HumanAbstract implements Comparable<Student>, Cloneable, Relax{
    int course;
    Subject favouriteSubject;


    public Student() {}

    public Student(String firstname, String fathername, String surname, int age, int course, Subject favouriteSubject) {
        this.firstname = firstname;
        this.fathername = fathername;
        this.surname = surname;
        setAge(age);
        this.course = course;
        this.setFavouriteSubject(favouriteSubject);
    }



   //////////////////////////////////////////////////////////////////////////
    @Override
    public String toString(){
        return "surname: " + this.getSurname() + ", name: " + this.getFirstname() + ", lastname: "
                + this.getFathername() + ", age: " + this.getAge() + ",  course: "
                + this.getCourse()+ " ,favouriteSubject: " + favouriteSubject.toString();
    }

    @Override
    public int hashCode(){
        return Objects.hash(firstname, fathername, surname, age, course, favouriteSubject);
    }

    @Override
    public boolean equals(Object o){
        if(o == this) return true;
        if(!(o instanceof Student )){
            return false;
        }

        Student student = (Student) o;
        return firstname == student.firstname &&
                Objects.equals(fathername, student.fathername) &&
                Objects.equals(surname, student.surname) &&
                Objects.equals(age, student.age) &&
                Objects.equals(course, student.course) &&
                Objects.equals(favouriteSubject, student.favouriteSubject);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Student student){

        return age >= student.age ? -1:1;

    }

    public void goRelax(){
        System.out.println("Щоб відпочити я іду на дискотеку");
    }
    //////////////////////////////////////////////////////////////////////////////


    public void setAge(int age) {
        if(age >= 17 && age <= 70)
            this.age = age;
        else System.out.println("Wrong Age");
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public Subject getFavouriteSubject() {
        return favouriteSubject;
    }

    public void setFavouriteSubject(Subject favouriteSubject) {
        this.favouriteSubject = favouriteSubject;
    }

}
