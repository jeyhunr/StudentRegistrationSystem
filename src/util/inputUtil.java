package util;

import java.util.Scanner;

public class inputUtil {
    public static String requireString (String inputText) {
        System.out.println(inputText);
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        return text;
    }

    public static int requireNumber (String inputText) {
        System.out.println(inputText);
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        return number;
    }
}
