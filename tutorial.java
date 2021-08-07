import java.util.Scanner;

public class tutorial {
    // method: identifier = main, with (parameter(s)). 
    // Parameter has arguments (the data passed into method/input)
    // access modifier = public, no object needed = static, 
    // return type = void (none)
    public static void main(String[] args) { 
        // print Hello World!
        System.out.println("Hello World!");   // output
        // declare new variable of data type Scanner called 'in' (arbitrary)
        Scanner in = new Scanner(System.in); // input from console
        String s = in.nextLine(); // store input in variable s
        System.out.println(s); // print user input

    }
}