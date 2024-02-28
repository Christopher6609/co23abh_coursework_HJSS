package Hatfield_Junior_Swimming_School;


import java.util.Scanner;

public class Operation {
    private int id;
    private String name;
    boolean exit = false;

    public Operation(){
        MenuNav();
    }


    public void MenuNav(){

        Scanner menuIn = new Scanner(System.in);
        do{
            System.out.println("[1]: Book a Swimming Lesson");
            System.out.println(("[2]: Change/Cancel a boooking"));
            System.out.println("[3]: Attend a swimming lesson");
            System.out.println("[4]: Monthly learner report");
            System.out.println("[5]: Monthly coach report");
            System.out.println("[6]: Register a new learner");
            System.out.println("[0]: Exit");
            System.out.println("Kindly enter a number to proceed: ");

            if (menuIn.hasNextInt()){
                int menuInput = menuIn.nextInt();

               if (menuInput == 0){
                   System.exit(0);

               }
                   else if(menuInput <= 6){
                  //System.out.println("I am here");
                   switch (menuInput){
                       case 1:
                           Booking();
                           break;
                       case 2:
                           System.out.println("i want to change");
                           break;
                       case 3:
                           System.out.println("Attend a swimming lesson");
                           break;
                       case 4:
                           System.out.println("Monthly learner report");
                           break;
                       case 5:
                           System.out.println("Monthly coach report");
                           break;
                       case 6:
                           System.out.println("Register a new learner");
                           break;
                   }
                   exit = true;
                }
                   else{
                    System.out.println("Invalid input!, Kindly enter a number between [0] - [6] ");
                    menuIn.nextLine();
                }

            }else{
                System.out.println("Invalid input!, Kindly enter a valid input to proceed: ");
                menuIn.nextLine();
            }
        } while (!exit);


    }

public void Booking(){
        System.out.println("Kindly select student name from the list");
    System.out.println("[0]: ");
}

    public int getId(){
        return this.id;
    }
    public String getname(){
        return this.name;
    }

}


