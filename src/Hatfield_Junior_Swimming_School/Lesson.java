package Hatfield_Junior_Swimming_School;

public class Lesson {
    public enum Grade{
        GRADE_1,
        GRADE_2,
        GRADE_3,
        GRADE_4,
        GRADE_5;
    }
    Grade grade;

    private String timeDuration; //there should be a time function in java
    private final int capacity;

    private String coach;
    private int id;

    public Lesson(int id, Grade grade, String timeDuration, int capacity){
        this.id = id;
        this.grade = grade;
        this.timeDuration = timeDuration;
        this.capacity = capacity;

    }

    public boolean bookingMax(){
        return this.capacity <= 4;
    }


}
