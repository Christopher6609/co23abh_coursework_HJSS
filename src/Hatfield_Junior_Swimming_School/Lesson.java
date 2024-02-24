package Hatfield_Junior_Swimming_School;

public class Lesson {
    private String grade;
    private String timeDuration; //there should be a time function in java
    private int capacity;

    private String coach;
    private int id;

    public Lesson(int id, String grade, String timeDuration, int capacity){
        this.id = id;
        this.grade = grade;
        this.timeDuration = timeDuration;
        this.capacity = capacity;

    }

    public boolean bookingMax(){
        return this.capacity <=4 ? true : false;
    }


}
