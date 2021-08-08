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

    /*public static void main(String[] args) { 
        // Day 1: print Hello World!
        //System.out.println("Hello World!"); // output
        
        // Day 2: take user input
        //System.out.println("Hello " + args[0]); // direct commandline input arg
        System.out.println("What's your name bruh?"); // ask user for input first
        // declare new variable of data type Scanner called 'in' (arbitrary)
        Scanner scanner = new Scanner(System.in); // input from console
        String name = scanner.nextLine(); // store input in variable s
        //System.out.println("Hi " + name + "!"); // print user input s

        // Day 3
        String easier = "wow, this is easier! " + name; // shorthand for new String (sexy syntax)
        System.out.println(easier);
        // arguments: what you pass to a method (Hello World!) (when you call a method)
        // parameter: variable that stores the argument (when you define a method)
        
        // variable: stores a value
        // expression: combine operands, evaluates to a value
        // oparator: work on operands to produce a value
        // operand: the things the operator works on
        // literal: a value (you can store in a variable)
        
        // Day 4
        // data type: how the computer interprets the data (Class)
        // Java is statically typed: define the type of variable up front
        // primitive type: original 8 classes (int x = 5;)
            // boolean, byte, char, int, short, long, float, double
        // object: instance of a class (Integer x = 5;) (5 is autoboxed)
        // variable creation: first declare, then initialise

        // where you declare your variables, determines where you can access them
        int x; // declaration
        if() {
            x = 5; // assign within this statement, initialization
        }
        x = 10; // re-assign outside the if-statement
        final int Y = 5; // constant value stored in Y (convention uses capitalization)
    } */
    /* Day 5: primitives
    public static void main(String[] args) {
        int i = 1; // 32 bit number
        boolean isPizzaDelicious = true; // false
        byte b = 127; // sequence of 8 bits: 10110110 (very small data type)
        byte a = 'A'; // can use the single quotes for ASCII binary character
        char c = 'Z'; // unicode
        short s = 3029; // small numbers
        long l = 2309735230065L; // large numbers (64 bit), use L at the end if out of range for int
        
        double y = 20.5; // decimal numbers (64 bit)
        float f = 20.5f; // need to end with an f (32 bit) seldom used, only when very restriced in memory

        double x = s / f;
        System.out.println(x);

    }*/

    // Day 6: more user input
    public static void main(String[] args) {
        
    }
}