package Hatfield_Junior_Swimming_School;

public class Student {
    private String name;
    private String gender;
    private int age;
    private String emergencyContactNum;
    private String gradeLevel;
    private int id;

    public Student(int id, String name, String gender, int age, String emergencyContactNum, String gradeLevel ){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.emergencyContactNum = emergencyContactNum;
        this.gradeLevel = gradeLevel;
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
    public String getGender(){
        return this.gender;
    }
    public void setGender(String gender){
        this.gender = gender;
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
    public void setEmergencyContactNum(String emergencyContactNum){
        this.emergencyContactNum = emergencyContactNum;
    }
    public String getGradeLevel(){
        return this.gradeLevel;
    }
    public void setGradeLevel(String gradeLevel){
        this.gradeLevel = gradeLevel;
    }

    public String toString(){
        return "************ Student Details ************"+ "\nStudent Name: " + name + "\nGender: " + gender + "\nAge: " + age + "\nEmergency Contact Number: " + emergencyContactNum + "\nGrade Level: " + gradeLevel + "\n";
    }
}