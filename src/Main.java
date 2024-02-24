import Hatfield_Junior_Swimming_School.Coach;
import Hatfield_Junior_Swimming_School.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student Chris = new Student(1, "Christopher", "male", 10, "07778640904","Grade 1");
        Coach Tee = new Coach(1, "Dominic");
        System.out.println(Chris.toString());
        System.out.println(Tee.toString());
    }
}