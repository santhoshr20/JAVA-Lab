package signin;

import java.io.*;
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Login {
    public int reg_no;
    public int year;
    public String rpassword;
    public String password;
    public String loginPass;
    public String user_name;
    public String mail_id;
    String loginUser;
    public String dept;
    Scanner sc = new Scanner(System.in);
    boolean login = true;
    boolean checkvalid = false;

    public void get_user() {
        cls();
        System.out.println("\n---Register your details for login--- \n");
        System.out.print("\nEnter a desired username   : ");
        user_name = sc.nextLine();
        System.out.print("\nEnter a desired mail ID    : ");
        mail_id = sc.nextLine();
        System.out.print("\nEnter a desired department : ");
        dept = sc.nextLine();
        System.out.print("\nEnter a register number    : ");
        reg_no = sc.nextInt();
        System.out.print("\nEnter a current year       : ");
        year = sc.nextInt();
        // System.out.print("\nEnter a desired password : ");
        sc.nextLine();
        password = getPassword("\nEnter a desired password   :  ");
        do {
            cls();
            System.out.println("\n---Register your details for login--- ");
            System.out.print("\n\nEnter a desired username   : " + user_name);
            System.out.print("\n\nEnter a desired mail ID    : " + mail_id);
            System.out.print("\n\nEnter a desired department : " + dept);
            System.out.print("\n\nEnter a register number    : " + reg_no);
            System.out.print("\n\nEnter a current year       : " + year);
            System.out.print("\n\nEnter a desired password   : ");
            // System.out.print("\n\nRenter the password : ");
            rpassword = getPassword("\n\nRenter  the password       : ");
        } while (!password.equals(rpassword));
        System.out.print("\nyou have succesfully registered");
        System.out.print("\n\n\n\t\t\t\tPress ENTER to continue with Login");
        sc.nextLine();
        cls();
        System.out.println("please log in.....\n");
        while (login) {
            checkvalid = false;
            System.out.print("\nUsername    : ");
            loginUser = sc.nextLine();
            // System.out.print("\nPassword: ");
            loginPass = getPassword("\nPassword    : ");
            if (loginUser.equals(user_name) && (loginPass.equals(password))) {
                checkvalid = true;
                login = false;
                System.out.print("\n     Acess granted ^̮ ^\n");
            } else {
                checkvalid = false;
                System.out.println("\nIncorrect username or password\n");
                System.out.println("Press ENTER to login again");
                sc.nextLine();
                cls();
                System.out.println("please log in again");
            }
        }
    }

    public static void cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception E) {
            System.out.println(E);
        }
    }

    private static String getPassword(String prompt) {

        String password = "";
        ConsoleEraser consoleEraser = new ConsoleEraser();
        System.out.print(prompt);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        consoleEraser.start();
        try {
            password = in.readLine();
        } catch (IOException e) {
            System.out.println("Error trying to read your password!");
            System.exit(1);
        }

        consoleEraser.halt();
        System.out.print("\b");
        return password;
    }

    private static class ConsoleEraser extends Thread {
        private boolean running = true;

        public void run() {
            while (running) {
                System.out.print("\b ");
                try {
                    Thread.currentThread().sleep(1);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }

        public synchronized void halt() {
            running = false;
        }
    }

}