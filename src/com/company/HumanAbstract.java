package com.company;

abstract class HumanAbstract implements Cloneable{
    String firstname;
    String fathername;
    String surname;
    int age;

    public HumanAbstract(){};

    public HumanAbstract(String firstname, String fathername, String surname, int age) {
        this.firstname = firstname;
        this.fathername = fathername;
        this.surname = surname;
        setAge(age);
    }



    public abstract String toString();

    public abstract int hashCode();

    public abstract boolean equals(Object o);

    //protected abstract Object clone();






    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setFathername(String lastname) {
        this.fathername = lastname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        if(age > 0 && age <= 150)
            this.age = age;
        else System.out.println("Wrong Age");
    }

    public String getFirstname() {
        return firstname;
    }

    public String getFathername() {
        return fathername;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
}
