package com.company;

import util.MenuUtil;
import util.inputUtil;

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
            MenuUtil.processMenu(menu);
        }
    }
}
