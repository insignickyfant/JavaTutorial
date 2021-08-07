import java.util.Scanner;

public class tutorial {
    // class: contains everything, has members (methods or properties)
    // method: does something, has statements (also called function)
    // statements: tell the computer something
    // properties: store something 
    // access modifier: (public/private) who can use?
    // static: no instance of class is needed
    // object: instance of a class 
    // return type = void (none)

    // arguments: what you pass to a method (Hello World!) (when you call a method)
    // parameter: variable that stores the argument (when you define a method)
    
    public static void main(String[] args) { 
        // print Hello World!
        System.out.println("Hello World!"); // output
        
        // Day 2: take user input
        //System.out.println("Hello " + args[0]); // direct commandline input arg

        // declare new variable of data type Scanner called 'in' (arbitrary)
        Scanner in = new Scanner(System.in); // input from console
        String s = in.nextLine(); // store input in variable s
        System.out.println("Hi " + s + "!"); // print user input s


    }
}