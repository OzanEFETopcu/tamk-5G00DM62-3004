/**
 * @author      Ozan Topcu <ozan.topcu@tuni.fi>
 * @version     2024.0126
 * @since       17.0
 */
class HelloWorld {


    public static String Hello(String name, String surname){
        String text_message = " Hello, I'm "+name+surname+" ";
        return text_message;
    }

    /**
    * Exercise: 1.1
    * Write the Hello World program.
    *
    * @param  args  Command line arguments. Not used.
    */
    public static void main(String[] args) {
        String text_message = Hello("Ozan", "Topcu");
        System.out.println("*************************\n*"+text_message+"*\n*************************");
    }
}

// End of file
