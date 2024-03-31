package project;

import java.util.Scanner;

public class Print{
    public String hello() {
        return "\nHello User, this is the testing project "
               + "there will be 9 separate classes\n"
               + "each with separate functionalities\n"
               + "there will be 9 separate classes\n"
               + "each with separate functionalities\n";
    }
    public String classChoiceMessage() {
        return "Please choose a class to test with numbers from 1-9";
    }
    public void directUserToClass() {
        @SuppressWarnings("resource")
        Scanner classChoice = new Scanner(System.in);
        String number = classChoice.nextLine();
        System.out.println("Username is: " + number);
    }
    public String thankYouMessage() {
        return "Thank you for testing this application";
    }
    public String repeatCheck(){
        System.out.println("If you want to continue press 1\nElse press something else");
        @SuppressWarnings("resource")
        Scanner repeatChoice = new Scanner(System.in);
        String number = repeatChoice.nextLine();
        return number;
    }
}
