import java.util.Scanner;

//public class tutorial {
    /* Terminology
    // class: contains everything, has members (methods or properties)
    // method: does something, has statements (also called function)
    // statements: tell the computer something
    // properties: store something 
    // access modifier: (public/private) who can use?
    // static: no instance of class is needed
    // object: instance of a class 
    // return type = void (none)*/
    /* Day 1-4
    public static void main(String[] args) { 
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
    /* Day 6: more user input and numeric datatypes
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int a = y + 20;
        System.out.println(a);

        BigDecimal money = scanner.nextBigDecimal(); // fixed point number, exact
        // nextBoolean accepts only true/false, otherwise error
        // nextInt(radix) is weird, look up.
        // can cast to diff primitive type, like
        int x = (int) scanner.nextDouble();

        // check what you can do with numeric classes
        System.out.println(Double.isNaN(Math.sqrt(-1))); // e.g.*/
    /* Operators
         * math with different classes doesn't work, always use the same
         * like 
         * double x = (double) 5 / 2.0;
         * with int, you get 2, modulo 1.
         * operands should be the same datatype as result.
         * +, -, /, *, % (modulus) 5%2=1
         * 
         * precedence: (parenteses)
         *             /, *, % from left to right
         *             +, - from left to right
         * 
         * x++ EQUALS x += 1 EQUALS x = x + 1 (same with minus)
         * ++x the same increment, but it works differently

         int x = 5;
         int a = x++; // assigned to a, then increment
         System.out.println(x);
         System.out.println(a); // gives 6, 5
        
         //but

         int x = 5;
         int a = ++x; // increment first, then assigned to a
         System.out.println(x);
         System.out.println(a); // gives 6, 6
        */
    /* Methods on Integer objects (static)
         * max: gives the largest of 2
         * compare: gives -, 0, + to show if x is smaller, equal, bigger than y argument
         * Integer.valueOf(string) gives the Integer value of a string (number)
         * Integer.parseInt(string) give the int value (primitive)*/
    /* String datatype (not a primitive, but a class)
         * If you make a String, you make an object (instance of a class)
         * String uses double quotes (char is single quotes)
         * use single character of a string:
         
        String s = "hello i'm\nbored";
        s.charAt(10);
          
         * \n = newline,  \t = tab,  \\ = \,  \' = ',  \" = "
         
        String name = "Caleb";
        String.format("hello %s", name);
        name.length(); (gives 5) */
    /* String Methods
        String x = "how you doing bro"
        charAt: spaces are also chars. index starts at 0
        x.concat("?") // adds to x
        x.contains("you"): true
        x.indexOf("how"): 0
        x.indexOf takes a second arg to say from what index it should start searching
        x.indexOf("how", diff.indexOf("my")+1))
        x.lastIndexOf("how"); gives the index where the last intance of how starts 
        
        x.toUpperCase/toLowerCase()
        x.strip(): takes away white space before and after
        x.stripLeading/stripTrailing for only start/end whitespace
        x.substring(beginIndex, endIndex)
        x.repeat(times)
        x.equals(string) --> boolean    
    }*/
    /* Classes and Objects
     * In a class, there's members: methods and properties (public variable).
     * (a non-public (private) variable is called a field) String s instead of public String s
     * Classes are used to represent something, like a user.
     * By convention, classes start with an upper case.*/
/* User class and string comparison    
public class Tutorial {
    public static void main(String[] args) {
        User user = new User(); // create instance of our user class
        System.out.println("Hi! What's your first name?");
        Scanner scanner = new Scanner(System.in);
        user.firstName = scanner.nextLine(); // setting a property
        
        //user.firstName = "Nicky"; // setting a property
        user.lastName = "Shears"; // should use loop for this

        System.out.println(user.getFullName()); 

        String password = "let me in!";
        System.out.println("Guess the password: ");
        Scanner scan = new Scanner(System.in);
        String guess = scanner.nextLine();

        if (password.equals(guess) == true) {
            System.out.println("Hooray!");
        } else System.out.println("incorrect");
        // alternative: 
        // if(password == guess)
        // for primitives, this will work, but not for objects!
        // for objects, this comparison asks if it's the same memory location
        // and not the content
    }
}*/

/* Password comparison and Method chaining
 * return: end method you're in
public class Tutorial {
    public static void main(String[] args) {
        String password = "let me in!";
        System.out.println("Guess the password: ");
        Scanner scan = new Scanner(System.in);
        String guess = scan.nextLine();

        if (password.toLowerCase().equals(guess.toLowerCase())) // method chaining
        {
            System.out.println("Hooray!");
        } else if ("can't touch this".equals(guess)) 
        {
            System.out.println("Hammer time!");
        } else System.out.println("Get outta here!");

        scanner.close(); // or it will stay open, needing memory
    }
} */

/* Comparison and Logical operators 
 * == equality
 * != inequality
 * < less than
 * > greater than
 * >= greater than or equal to
 * <= less than or equal to
 * ----> they always return true or false
 * 
 * && and, both need to be true
 * || or, at least one needs to be true
 * ! not, opposite must be true
 * 
 * don't use && and || in the same expression, or at least use () */
 
/* Switch or if statements, ternary ?
 * use switch if discreet number of values to choose from
 * use if when there's ranges of values
 * 
 * just see what's easier and requires the least amount of code I guess
 * 
switch(name){
    case "Nicky":
    case "Charlie":
        sysout("welcome my man");
        break;
    default:
        sysout("fuck off");
        break;
} 
 * 
 * ternary (conditional) operator: ?
 * takes 3 operands: expression ? result if true : result if false
 * 
boolean welcome = name.equals("Nicky") ? true : false
 *
 * basically states that if the name is Nicky, then welcome is true, else false.
 * same thing but in if statement, so more code:
boolean welcome;
if(name.equals("Nicky")) {
   welcome = true;
} else welcome = false; */

/* Loops: while, do while, for
 * ICU: initialisation, condition, update
int i = 1;
while (i < 11) {
    System.out.println("iteration " + i);
    i++;
}
 *
 * to execute something at least once, then check if you want to 
 * continue doing the same thing, use a do while loop
 *
public class Tutorial {
    public static void main(String[] args) {
        String password = "let me in";
        Scanner scanner = new Scanner(System.in);
        String guess;

        do {
            System.out.println("Guess password: ");
            guess = scanner.nextLine();
        } while (!guess.equals(password));
        System.out.println("You're in!");
        scanner.close();
    }
} 
 * 
 * If you know how many times you want a loop to iterate, use a for loop.
 * The for loop houses the ICU in it's parenteses. 

public class Tutorial {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
} 

public class Tutorial {
    public static void main(String[] args) {
        int i = 9;
        while(i >= 0) {
            int k = i;
            while(k >= 0) {
                System.out.print(k + " ");
                k--;
            }
            System.out.println();
            i--;
        }
        for(int i = 9; i >= 0; i--) { // make number pyramid (kinda)
            for(int k = i; k >=0; k--) {
                if (k == 2) continue; // skips 2
                if(k == 6) break; // breaks out of the loop
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
} */

/* Arrays */
public class Tutorial {
    public static void main(String[] args) {
        int[] grades = new int[10];
    }
}