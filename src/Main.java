import Hatfield_Junior_Swimming_School.Coach;
import Hatfield_Junior_Swimming_School.Lesson;
import Hatfield_Junior_Swimming_School.Student;

import java.util.ArrayList;
import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Christopher", Student.Gender.MALE, 10, "07778640904",Lesson.Grade.GRADE_1);
        Student student2 = new Student(2, "Daniel", Student.Gender.MALE, 20, "077493975833", Lesson.Grade.GRADE_2);
        Student student3 = new Student(3, "Jasmine", Student.Gender.FEMALE, 24, "07743683835", Lesson.Grade.GRADE_4);
        Student student4 = new Student(4, "Albert", Student.Gender.MALE, 27, "07747483933", Lesson.Grade.GRADE_5);
        Student student5 = new Student(5, "Grace", Student.Gender.FEMALE, 23, "077899473983", Lesson.Grade.GRADE_2);
        Student student6 = new Student(6, "Tommy", Student.Gender.MALE, 27, "074738438433", Lesson.Grade.GRADE_1);
        Student student7 = new Student(7, "John", Student.Gender.MALE, 26, "077476353633", Lesson.Grade.GRADE_3);
        Student student8 = new Student(8, "Tracy", Student.Gender.FEMALE, 20, "077494783833", Lesson.Grade.GRADE_2);
        Student student9 = new Student(9, "Sofeeyah", Student.Gender.FEMALE, 19, "077736363833", Lesson.Grade.GRADE_1);
        Student student10 = new Student(10, "Bob", Student.Gender.MALE, 21, "077737383333", Lesson.Grade.GRADE_2);


        Coach coach1 = new Coach(1, "Dominic");
        Coach coach2 = new Coach(2, "Steve");
        Coach coach3 = new Coach(3, "Gray");
        Coach coach4 = new Coach(4, "Tina");
        Coach coach5 = new Coach(5, "Viktoria");
//       System.out.println(student1.toString());
//        System.out.println(coach1.toString());

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(student1 = new Student(1, "Christopher", Student.Gender.MALE, 10, "07778640904",Lesson.Grade.GRADE_1));
        studentList.add(student2 = new Student(2, "Daniel", Student.Gender.MALE, 20, "077493975833", Lesson.Grade.GRADE_2));
        studentList.add(student3 = new Student(3, "Jasmine", Student.Gender.FEMALE, 24, "07743683835", Lesson.Grade.GRADE_4));
        studentList.add(student4 = new Student(4, "Albert", Student.Gender.MALE, 27, "07747483933", Lesson.Grade.GRADE_5));
        studentList.add(student5 = new Student(5, "Grace", Student.Gender.FEMALE, 23, "077899473983", Lesson.Grade.GRADE_2));
        studentList.add(student6 = new Student(6, "Tommy", Student.Gender.MALE, 27, "074738438433", Lesson.Grade.GRADE_1));
        studentList.add(student7 = new Student(7, "John", Student.Gender.MALE, 26, "077476353633", Lesson.Grade.GRADE_3));
        studentList.add(student8 = new Student(8, "Tracy", Student.Gender.FEMALE, 20, "077494783833", Lesson.Grade.GRADE_2));
        studentList.add(student9 = new Student(9, "Sofeeyah", Student.Gender.FEMALE, 19, "077736363833", Lesson.Grade.GRADE_1));
        studentList.add(student10 = new Student(10, "Bob", Student.Gender.MALE, 21, "077737383333", Lesson.Grade.GRADE_2));
        Student[] studentsArray = studentList.toArray(new Student[0]);

        List<Coach> coachList = new ArrayList<Coach>();
        coachList.add(coach1 = new Coach(1, "Dominic"));
        coachList.add(coach2 = new Coach(2, "Steve"));
        coachList.add(coach3 = new Coach(3, "Gray"));
        coachList.add(coach4 = new Coach(4, "Tina"));
        coachList.add(coach5 = new Coach(5, "Viktoria"));
        Coach[] coachesArray = coachList.toArray(new Coach[0]);


    }
}