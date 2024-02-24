package Hatfield_Junior_Swimming_School;

public class Coach {
    private String name;
    private int id;

    public Coach(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int id(){
        return this.id;
    }

    public String toString(){
        return "*********** Coach Details ************" + "\nCoach Name:  " + name ;
    }


}
