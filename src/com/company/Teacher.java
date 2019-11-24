package com.company;

import java.util.Objects;

public class Teacher extends HumanAbstract implements Cloneable, Relax{
    private int rating;

    public Teacher (){

    }
    public Teacher(String firstname,  String fathername, String surname,int age, int rating){
        this.firstname = firstname;
        this.fathername = fathername;
        this.surname = surname;
        this.age = age;
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void setAge(int age) {

        if(age >= 23 && age <= 70)
            this.age = age;
        else System.out.println("Wrong Age");
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    //////////////////////////////////////////////////////////////////////////////
    @Override
    public String toString(){
        return "surname: " + this.getSurname() + ", name: " + this.getFirstname() + ", lastname: "
                + this.getFathername() + ", age: " + this.getAge() + ",  rating: "
                + this.getRating();
    }

    @Override
    public int hashCode(){
        return Objects.hash(firstname, fathername, surname, age, rating);
    }

    @Override
    public boolean equals(Object o){
        if(o == this) return true;
        if(!(o instanceof Student )){
            return false;
        }

        Teacher teacher = (Teacher) o;
        return firstname == teacher.firstname &&
                Objects.equals(fathername, teacher.fathername) &&
                Objects.equals(surname, teacher.surname) &&
                Objects.equals(age, teacher.age) &&
                Objects.equals(rating, teacher.rating);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }



    public int compareTo(Teacher teacher){

        return age >= teacher.age ? -1:1;

    }

    public void goRelax(){
        System.out.println("Щоб відпочити я беру відпустку");
    }
    //////////////////////////////////////////////////////////////////////////////

}
