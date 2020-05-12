package inst;

import java.util.*;

public class Instruction {

    public void Instr() {
        System.out.println("\n                Instructions for Taking a Quiz");
        System.out.println("-------------------------------------------------------------------");
        System.out.println(
                "\nRegister and LogIn When you access a Quiz page.\n\nTaking the Quiz\n\n1] Select an answer for every question.chose a valid answer*.");
        System.out.println(
                "\n2] There are two possible question types:\n   i)   Multiple Choice: only one answer can be selected for\n        a multiple choice question.\n   ii)   True/False: choose either trure or false");
        System.out.println(
                "\n3]At the end  you might be able to check your answers*\n\n4]If you want to try to get a better score, select Try Again,*\n  hence You can try the quiz as many times as you like.\n");
        System.out.println("                          Good Luck");
        System.out.println("-------------------------------------------------------------------");
    }

    public void FeedP() {
        System.out.println("\nCongrate,you have done well,Keep it up\n   Happy Coding.... \n");
    }

    public void Feedn() {
        System.out.println(
                "\nUnfortinuatly you have scored average score,Please Try to improve youe programming skills\n");
    }

    public void Feedvn() {
        System.out.println(
                "\nIt's insane,You have scored very Poor score,You have to concentrate more on theory to understand basic concepts of JAVA\nFor this you can follow the link given below\n\nhttps://docs.oracle.com/javase/tutorial/java/concepts/index.html\n");
    }

    public void ans() {
        System.out.println("----Answer----");
        System.out.println("\n[1] : b. False");
        System.out.println("\n[2] : b. static interrupted() ");
        System.out.println("\n[3] : c. Inheritance");
        System.out.println("\n[4] : b. 49");
        System.out.println("\n[5] : a. True");
        System.out.println("\n[6] : a. Error");
        System.out.println("\n[7] : a. Checked Exception ");
        System.out.println("\n[8] : b. ArrayIndexOutOfBoundsException");
        System.out.println("\n[9] : a. import");
        System.out.println("\n[10]: a. True\n");
    }
}