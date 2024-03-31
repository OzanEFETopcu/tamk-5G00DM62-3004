package project;

public class Main {
    public static void main(String[] args) {
        Print output = new Print();
        String repeatCheck = "1";

        while (repeatCheck == "1") {

            String text1 = output.hello();
            System.out.println(text1);

            String text2 = output.classChoiceMessage();
            System.out.println(text2);
            output.directUserToClass();

            String text3 = output.thankYouMessage();
            System.out.println(text3);
            
            String text4 = output.repeatCheck();
            repeatCheck = text4;
        }

    }
}
