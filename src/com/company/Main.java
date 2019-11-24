package com.company;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException{
	// write your code here
        //HumanAbstract human = new HumanAbstract("Yurii", "Ruslanovich", "Huley", 19);

        Subject subject1 = new Subject("Programing", true, 100, true, Subject.OKR.master);
        Student student = new Student("Roman", "Romanovich", "Sklepovyy", 19, 2, subject1);
        Teacher teacher = new Teacher("Michael", "Michaelovich", "Shpitko", 19, 90);

        System.out.println("Student and Teacher to string");
        System.out.println(student.toString());
        System.out.println(teacher.toString());
        System.out.println();

        System.out.println("Hash code");
        System.out.println(student.hashCode());
        System.out.println(teacher.hashCode());
        System.out.println();

        Student student2 = (Student) student.clone();
        student2.setFirstname("Андрій");
        System.out.println(student2);

        Teacher teacher2 = (Teacher) teacher.clone();
        teacher2.setFirstname("Nazar");
        System.out.println(teacher2);
        System.out.println();

        System.out.println("Equals for student");
        if(student.equals(student2)){
            System.out.println("students are equuals");
        }else System.out.println("students aren`t equuals");


        System.out.println("Equals for teacher");
        if(teacher.equals(teacher2)){
            System.out.println("teachers are equuals");
        }else System.out.println("teachers aren`t equuals");

        if(student.compareTo(student2)< 0 ){
            System.out.println(student + " is better");
        } else if(student.compareTo(student2) > 0){
            System.out.println(student2 + " is better");
        } else System.out.println("They are similar");



        if(teacher.compareTo(teacher2) < 0){
            System.out.println(teacher + " is better");
        }else if(teacher.compareTo(teacher2) > 0){
            System.out.println(teacher2 + " is better");
        } else System.out.println("They are similar");

        teacher.goRelax();
        student.goRelax();
    }
}
