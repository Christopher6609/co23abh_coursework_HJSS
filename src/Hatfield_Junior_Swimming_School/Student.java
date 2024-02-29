package Hatfield_Junior_Swimming_School;

import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private String emergencyContactNum;
    private int id;
    public enum Gender{
        MALE,
        FEMALE,
        OTHERS;
    }
    Gender gender;
Lesson.Grade grade;




    public Student(int id, String name, Gender gender, int age, String emergencyContactNum, Lesson.Grade grade){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.emergencyContactNum = emergencyContactNum;

    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getEmergencyContactNum(){
        return this.emergencyContactNum;
    }
    public void setEmergencyContactNum(String emergencyContactNum) {
        this.emergencyContactNum = emergencyContactNum;

    }


//


    public String toString(){
        return "************ Student Details ************"+ "\nStudent Name: " + name + "\nGender: " + gender + "\nAge: " + age + "\nEmergency Contact Number: " + emergencyContactNum + "\nGrade Level: " + grade +"\n";
    }


}
