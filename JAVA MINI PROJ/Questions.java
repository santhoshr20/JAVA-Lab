import java.util.Scanner;
import java.io.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import signin.*;
import inst.*;

class Invalid_Choice extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public String toString() {
        return "Found";
    }
}

public class Questions {

    public static void main(String[] args) throws FileNotFoundException {
        int choice, score = 0;
        char t = 'n';
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        Scanner sc = new Scanner(System.in);
        cls();
        Instruction i = new Instruction();
        i.Instr();
        System.out.print("                                            Press ENTER to Continue");
        sc.nextLine();
        cls();
        Login l = new Login();
        l.get_user();
        System.out.print("\n                         Press ENTER to Continue");
        sc.nextLine();

        do {
            cls();
            System.out.println("\n  **ONLINE JAVA QUIZ**\n");
            System.out.println("\n---------Welcome---------\n");
            System.out.println(
                    "[1] Enter Quiz\n[2] Tryagain\n[3] View Result\n[4] Print Result and Exit\n[5] view Answers\n[6] Exit");
            System.out.println("\n-------------------------\n");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("\nBetter luck \n");
                score = run();
            } else if (choice == 2) {
                System.out.println("\nBetter luck this time \n");
                score = run();
            } else if (choice == 3) {
                cls();
                System.out.println("          JAVA ONLINE QUIZ PROGRAM");
                System.out.println("                                       " + dtf.format(now));
                System.out.println("\n---------------------------------------------------------");
                System.out.print("\nUsername       : " + l.user_name);
                System.out.print("\nDepartment     : " + l.dept);
                System.out.print("\nReg_No         : " + l.reg_no);
                System.out.print("\nCurrent Year   : " + l.year);
                System.out.print("\nMail ID        : " + l.mail_id);
                System.out.println("\n---------------------------------------------------------");
                System.out.print("\nYour score is " + score + "/10");
                System.out.println("\n---------------------------------------------------------");
                if (score >= 8) {
                    i.FeedP();
                } else if ((score >= 4) && (score < 8)) {
                    i.Feedn();
                } else {
                    i.Feedvn();
                }
                sc.nextLine();
                sc.nextLine();

            } else if (choice == 5) {
                System.out.println("Are you sure to view Answers ,Better you can try those again by Hitting 'Y'");
                t = sc.next().charAt(0);
                if ((t == 'y') || (t == 'Y')) {
                    System.out.println("\nBetter luck this time\n");
                    cls();
                    score = run();
                } else {
                    i.ans();
                    sc.nextLine();
                    sc.nextLine();
                }
            }
            if (choice == 4) {
                PrintStream o = new PrintStream(new File("Result.txt"));
                PrintStream console = System.out;
                System.setOut(console);
                System.setOut(o);
                System.out.println("          JAVA ONLINE QUIZ PROGRAM");
                System.out.println("                                       " + dtf.format(now));
                System.out.println("\n---------------------------------------------------------");
                System.out.print("\nUsername       : " + l.user_name);
                System.out.print("\nDepartment     : " + l.dept);
                System.out.print("\nReg_No         : " + l.reg_no);
                System.out.print("\nCurrent Year   : " + l.year);
                System.out.print("\nMail ID        : " + l.mail_id);
                System.out.println("\n---------------------------------------------------------");
                System.out.println("Your score is " + score + "/10");
                System.out.println("\n---------------------------------------------------------");
                System.out.println("\n                                            sandy");
                System.out.println("                                   signature of quiz master");
                break;
            }
        } while (choice != 6);
    }

    public static void cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception E) {
            System.out.println(E);
        }
    }

    public static int run() {
        Scanner sc = new Scanner(System.in);
        char q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;

        int score = 0;
        System.out.println();
        cls();
        System.out
                .println("1)   Unchecked exceptions are checked at compile-time rather they are checked at runtime.\n");
        System.out.println("a. True\nb. False");
        System.out.print("\nEnter Your Choice  : ");
        q1 = sc.next().charAt(0);
        try {
            if ((q1 != 'a') && (q1 != 'b') && (q1 != 'c') && (q1 != 'd')) {
                throw new Invalid_Choice();
            }
        } catch (Invalid_Choice e) {
            System.out.println("\nInvalid_Choice " + e);
            System.out.print("\nEnter choice again  : ");
            q1 = sc.next().charAt(0);
        }
        if (q1 != 'b') {
            System.out.println("\nYour answer is incorrect !!!");
        }
        {
            while (q1 == 'b') {
                System.out.println("\n\nCongrate you answer is correct");
                score++;
                break;
            }
            System.out.println();
            sc.nextLine();
        }

        sc.nextLine();
        cls();
        System.out.println(
                "2)   Which method returns the interrupted flag after that it sets the flag to false if it is true?\n");
        System.out.println("a. isInterrupted()\tb. static interrupted()\nc. non static interrupted()\td. Both A & C");
        System.out.print("\nEnter Your Choice  : ");
        q2 = sc.next().charAt(0);
        try {
            if ((q2 != 'a') && (q2 != 'b') && (q2 != 'c') && (q2 != 'd')) {
                throw new Invalid_Choice();
            }
        } catch (Invalid_Choice e) {
            System.out.println("\nInvalid_Choice " + e);
            System.out.print("\nEnter choice again  : ");
            q2 = sc.next().charAt(0);
        }
        if (q2 != 'b') {
            System.out.println("\nYour answer is incorrect !!!");
        }
        {
            while (q2 == 'b') {
                System.out.println("Congrate you answer is correct");
                score++;
                break;
            }
            System.out.println();
            sc.nextLine();
        }

        sc.nextLine();
        cls();
        System.out.println(
                "3)   The following Syntax is used for?\nclass Subclass-name extends Superclass-name\n{\n//methods and fields\n}\n");
        System.out.println("a. Polymorphism\tb. Encapsulation\nc. Inheritance\td. None of the above");
        System.out.print("\nEnter Your Choice  : ");
        q3 = sc.next().charAt(0);
        try {
            if ((q3 != 'a') && (q3 != 'b') && (q3 != 'c') && (q3 != 'd')) {
                throw new Invalid_Choice();
            }
        } catch (Invalid_Choice e) {
            System.out.println("\nInvalid_Choice " + e);
            System.out.print("\nEnter choice again  : ");
            q3 = sc.next().charAt(0);
        }
        if (q3 != 'c') {
            System.out.println("\nYour answer is incorrect !!!");
        }

        {
            while (q3 == 'c') {
                System.out.println("Congrate you answer is correct");
                score++;
                break;
            }
            System.out.println();
            sc.nextLine();

        }

        sc.nextLine();
        cls();
        System.out.println("4)   How many reserved keywords are currently defined in the Java language?\n");
        System.out.println("a. 48\tb. 49\nc. 50\td. 47");
        System.out.print("\nEnter Your Choice  : ");
        q4 = sc.next().charAt(0);
        try {
            if ((q4 != 'a') && (q4 != 'b') && (q4 != 'c') && (q4 != 'd')) {
                throw new Invalid_Choice();
            }
        } catch (Invalid_Choice e) {
            System.out.println("\nInvalid_Choice " + e);
            System.out.print("\nEnter choice again  : ");
            q4 = sc.next().charAt(0);
        }
        if (q4 != 'b') {
            System.out.println("\nYour answer is incorrect !!!");
        }

        {
            while (q4 == 'b') {
                System.out.println("Congrate you answer is correct");
                score++;
                break;
            }
            System.out.println();
            sc.nextLine();

        }

        sc.nextLine();
        cls();
        System.out.println("5)   Switch is more efficient than nested if or if - else in java.\n");
        System.out.println("a. True\tb. False");
        System.out.print("\nEnter Your Choice  : ");
        q5 = sc.next().charAt(0);
        try {
            if ((q5 != 'a') && (q5 != 'b') && (q5 != 'c') && (q5 != 'd')) {
                throw new Invalid_Choice();
            }
        } catch (Invalid_Choice e) {
            System.out.println("\nInvalid_Choice " + e);
            System.out.print("\nEnter choice again  : ");
            q5 = sc.next().charAt(0);
        }
        if (q5 != 'a') {
            System.out.println("\nYour answer is incorrect !!!");
        }
        {
            while (q5 == 'a') {
                System.out.println("Congrate you answer is correct");
                score++;
                break;
            }
            System.out.println();
            sc.nextLine();

        }

        sc.nextLine();
        cls();
        System.out.println("6)   Which is irrecoverable?\n");
        System.out.println("a. Error\tb. Checked Exception\nc. Unchecked Exception\td. Both B & C");
        System.out.print("\nEnter Your Choice  : ");
        q6 = sc.next().charAt(0);
        try {
            if ((q6 != 'a') && (q6 != 'b') && (q6 != 'c') && (q6 != 'd')) {
                throw new Invalid_Choice();
            }
        } catch (Invalid_Choice e) {
            System.out.println("\nInvalid_Choice " + e);
            System.out.print("\nEnter choice again  : ");
            q6 = sc.next().charAt(0);
        }
        if (q6 != 'a') {
            System.out.println("\nYour answer is incorrect !!!");
        }

        {
            while (q6 == 'a') {
                System.out.println("Congrate you answer is correct");
                score++;
                break;
            }
            System.out.println();
            sc.nextLine();

        }

        sc.nextLine();
        cls();
        System.out.println(
                "7)    What is known as the classes that extend Throwable class except RuntimeException and Error?\n");
        System.out.println("a. Checked Exception\tb. Unchecked Exception\nc. Error\td. None of the above");
        System.out.print("\nEnter Your Choice  : ");
        q7 = sc.next().charAt(0);
        try {
            if ((q7 != 'a') && (q7 != 'b') && (q7 != 'c') && (q7 != 'd')) {
                throw new Invalid_Choice();
            }
        } catch (Invalid_Choice e) {
            System.out.println("\nInvalid_Choice " + e);
            System.out.print("\nEnter choice again  : ");
            q7 = sc.next().charAt(0);
        }
        if (q7 != 'a') {
            System.out.println("\nYour answer is incorrect !!!");
        }

        {
            while (q7 == 'a') {
                System.out.println("Congrate you answer is correct");
                score++;
                break;
            }
            System.out.println();
            sc.nextLine();

        }

        sc.nextLine();
        cls();
        System.out.println(
                "8)If you are inserting any value in the wrong index as shown below,\nint a[]=new int[5];\na[10]=50;\n\nit would result in ______.\n");
        System.out.println(
                "a. NullPointerException\tb. ArrayIndexOutOfBoundsException\nc. ArithmeticException\td. NumberFormatException");
        System.out.print("\nEnter Your Choice  : ");
        q8 = sc.next().charAt(0);
        try {
            if ((q8 != 'a') && (q8 != 'b') && (q8 != 'c') && (q8 != 'd')) {
                throw new Invalid_Choice();
            }
        } catch (Invalid_Choice e) {
            System.out.println("\nInvalid_Choice " + e);
            System.out.print("\nEnter choice again  : ");
            q8 = sc.next().charAt(0);
        }
        if (q8 != 'b') {
            System.out.println("\nYour answer is incorrect !!!");
        }

        {
            while (q8 == 'b') {
                System.out.println("Congrate you answer is correct");
                score++;
                break;
            }
            System.out.println();
            sc.nextLine();

        }

        sc.nextLine();
        cls();
        System.out.println("9)    Which provides accessibility to classes and interface?\n");
        System.out.println("a. import\tb. Static import\nc. All the above\td. None of the above");
        System.out.print("\nEnter Your Choice  : ");
        q9 = sc.next().charAt(0);
        try {
            if ((q9 != 'a') && (q9 != 'b') && (q9 != 'c') && (q9 != 'd')) {
                throw new Invalid_Choice();
            }
        } catch (Invalid_Choice e) {
            System.out.println("\nInvalid_Choice " + e);
            System.out.print("\nEnter choice again  : ");
            q9 = sc.next().charAt(0);
        }
        if (q9 != 'a') {
            System.out.println("\nYour answer is incorrect !!!");
        }

        {
            while (q9 == 'a') {
                System.out.println("Congrate you answer is correct");
                score++;
                break;
            }
            System.out.println();
            sc.nextLine();

        }

        sc.nextLine();
        cls();
        System.out.println(
                "10)   An interface is a blueprint of a class. It has static constants and abstract methods.\n");
        System.out.println("a. True\tb. False");
        System.out.print("\nEnter Your Choice  : ");
        q10 = sc.next().charAt(0);
        try {
            if ((q10 != 'a') && (q10 != 'b') && (q10 != 'c') && (q10 != 'd')) {
                throw new Invalid_Choice();
            }
        } catch (Invalid_Choice e) {
            System.out.println("\nInvalid_Choice " + e);
            System.out.print("\nEnter choice again  : ");
            q10 = sc.next().charAt(0);
        }
        if (q10 != 'a') {
            System.out.println("\nYour answer is incorrect !!!");
        }
        {
            while (q10 == 'a') {
                System.out.println("Congrate you answer is correct");
                score++;
                break;
            }
            System.out.println();
        }
        sc.nextLine();
        sc.nextLine();
        return score;
    }

}