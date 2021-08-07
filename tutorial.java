import java.util.Scanner;

public class tutorial {
    // class: contains everything, has members (methods or properties)
    // method: does something, has statements
    // statements: tell the computer something
    // properties: store something 
    // access modifier: (public/private) who can use?
    // static: no instance of class is needed
    // object: instance of a class 
    // return type = void (none)

    // arguments: 
    public static void main(String[] args) { 
        // print Hello World!
        System.out.println("Hello World!");   // output
        // declare new variable of data type Scanner called 'in' (arbitrary)
        Scanner in = new Scanner(System.in); // input from console
        String s = in.nextLine(); // store input in variable s
        System.out.println(s); // print user input

    }
}