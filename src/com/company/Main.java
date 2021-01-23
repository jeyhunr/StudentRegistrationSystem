package com.company;

import beans.Config;
import beans.Student;
import util.inputUtil;
import util.studentUtil;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int menu = 0;
        while (true) {
            menu = inputUtil.requireNumber("What do you want to do: "
                    + "\n1. Student register "
                    + "\n2. Show all students"
                    + "\n3. Find student"
                    + "\n4. Update student"
                    + "\n5. Exit");

            if (menu == 1) {
                studentUtil.registerStudent();
            } else if (menu == 2) {
                studentUtil.printAllRegisteredStudents();
            } else if (menu == 3) {
                studentUtil.findStudentsAndPrint();
            } else if (menu == 4) {

            } else if (menu == 5) {
                break;
            } else {
                System.out.println("the entered number is wrong");
            }
        }
    }
}
