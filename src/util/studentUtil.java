package util;

import beans.Config;
import beans.Student;

public class studentUtil {
    public static Student fillStudent () {
        String name = inputUtil.requireString("Please enter name:");
        String surname = inputUtil.requireString("Please enter surname");
        int age = inputUtil.requireNumber("Please enter age");
        String className = inputUtil.requireString("Please enter class");

        Student st = new Student(name, surname, age, className);
        return st;
    }

    public static void printAllRegisteredStudents () {
       if (Config.students == null) {
           return;
       }

        for (int i=0; i<Config.students.length; i++) {
            Student st = Config.students[i];
            System.out.println(st.getFullInfo());
        }
    }

    public static void registerStudent () {
        int count = inputUtil.requireNumber("How many students will you register?");
        Config.students = new Student[count];

        for (int i=0; i<count; i++){
            System.out.println((i+1) + ".Register");

            Config.students[i] = studentUtil.fillStudent();;
        }
        System.out.println("registration completed successfully");
        studentUtil.printAllRegisteredStudents();
    }

    public static void findStudentsAndPrint () {
        String text = inputUtil.requireString("type name, surname or class name");
        Student[] result = findStudents(text);
        for (int i=0; i<result.length; i++) {
            System.out.println(result[i].getFullInfo());
        }
    }

    public static Student[] findStudents (String text) {
        int count = 0;
        for (int i=0; i<Config.students.length; i++) {
            Student st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)) {
                count++;
            }
        }

        Student result[] = new Student[count];
        int found = 0;
        for (int i=0; i<Config.students.length; i++) {
            Student st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)) {
                result[found++] = st;
            }
        }
        return result;
    }
}
