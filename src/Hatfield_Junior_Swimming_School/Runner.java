package Hatfield_Junior_Swimming_School;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    static ArrayList<Student> studentList = new ArrayList();
    Scanner input = new Scanner(System.in);
    boolean exit = false;

    public void MenuNav() {
        do {
            System.out.println("********** Welcome to Hatfield Swimming School **********" + "\nSelect an Operation");
            System.out.println("[1]: Student Login");
            System.out.println(("[2]: Change/Cancel a boooking"));
            System.out.println("[3]: Attend a swimming lesson");
            System.out.println("[4]: Monthly learner report");
            System.out.println("[5]: Monthly coach report");
            System.out.println("[6]: Register a new learner");
            System.out.println("[0]: Exit");
            System.out.println("Kindly enter a number to proceed: ");

            if (input.hasNextInt()) {
                int menuInput = input.nextInt();
                if (menuInput == 0) {
                    System.exit(0);
                } else if (menuInput <= 6) {
                    if (menuInput == 1 || menuInput == 2 || menuInput == 3){
                        Booking();
                    }
                    exit = true;
                } else {
                    System.out.println("Invalid input!, Kindly enter a number between [0] - [6] ");
                    input.nextLine();
                }
            }else{
                System.out.println("Invalid input!, Kindly enter a valid input to proceed: ");
                input.nextLine();
            }
        }while (!exit);
    }

    public void Booking() {
        do {
            System.out.println("Kindly select your name");
            for (Student i : studentList) {
                System.out.println("[" + i.getId() + "] " + i.getName());
            }
            System.out.println("[0] Exit\n");
            System.out.print("Enter a number to proceed: ");

            if (input.hasNextInt()) {
               int studentInput = input.nextInt();
                if (studentInput == 0) {
                    System.exit(0);
                }else {
                    for (Student i : studentList) {
                       if(studentInput == i.getId()){
                           System.out.println("Welcome " + i.getName() + "!" + "\n" +i.toString());
                           System.out.println(("[1]: Book a swimming lesson"));
                           System.out.println(("[2]: Change/Cancel a boooking"));
                           System.out.println("[3]: Attend a swimming lesson");
                           System.out.println("[4]: Monthly learner report");
                           System.out.println("[0]: Exit");
                           System.out.println("Kindly enter a number to proceed: ");
                       }
                }
                }exit = true;
            } else {
                System.out.println("\n\nInvalid Input!\n");
                input.nextLine();
            }
        } while (!exit);
    }



    public Runner(){
        MenuNav();
    }

    public static void main(String[] args) {

        Student student1 = new Student(1, "Christopher", Student.Gender.MALE, 10, "07778640904", Lesson.Grade.GRADE_1);
        Student student2 = new Student(2, "Daniel", Student.Gender.MALE, 20, "077493975833", Lesson.Grade.GRADE_2);
        Student student3 = new Student(3, "Tobi", Student.Gender.MALE, 20, "077493975833", Lesson.Grade.GRADE_2);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        Runner run = new Runner();


    }
}
