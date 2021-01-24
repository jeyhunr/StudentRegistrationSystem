package util;

import beans.Config;
import beans.Student;

public class studentUtil {
    public static Student fillStudent () {
        String name = MenuUtil.requireName();
        String surname = MenuUtil.requireSurname();
        int age = MenuUtil.requireAge();
        String className = MenuUtil.requireClassname();

        Student st = new Student(name, surname, age, className);
        return st;
    }

    public static void printAllRegisteredStudents () {
       if (Config.students == null) {
           return;
       }

        for (int i=0; i<Config.students.length; i++) {
            Student st = Config.students[i];
            System.out.println((i+1) + " " + st.getFullInfo());
        }
    }

    public static void registerStudent () {
        int count = inputUtil.requireNumber("How many students will you register?");
        Config.students = new Student[count];

        for (int i=0; i<count; i++){
            System.out.println((i+1) + ".Register");

            Config.students[i] = studentUtil.fillStudent();;
        }
        MenuUtil.showSuccessOpMessage();
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

    public static void updateStudentWithNewObject () {
        studentUtil.printAllRegisteredStudents();

        int i = inputUtil.requireNumber("enter index of student, which you want to update");

        System.out.println("enter the new infos");
        Student s = studentUtil.fillStudent();

        Config.students[i-1] = s;
    }

    public static void updateStudentWithSameObject () {
        studentUtil.printAllRegisteredStudents();

        int i = inputUtil.requireNumber("enter index of student, which you want to update");

        Student selectedStudent = Config.students[i-1];
        String changeParams = inputUtil.requireString("enter params like this: 'name','surname','age','classname'");

        if (changeParams.contains("'name'")) {
            selectedStudent.setName(inputUtil.requireString("enter name"));
        }
        if (changeParams.contains("'surname'")) {
            selectedStudent.setSurname(inputUtil.requireString("enter surname"));
        }
        if (changeParams.contains("'age'")) {
            selectedStudent.setAge(inputUtil.requireNumber("enter age"));
        }
        if (changeParams.contains("'classname'")) {
            selectedStudent.setClassName(inputUtil.requireString("enter class name"));
        }
    }
}
