package util;

public class MenuUtil {
    public static void processMenu (int selectedMenu) {

        switch (selectedMenu) {
            case 1:
                studentUtil.registerStudent();
                break;
            case 2:
                studentUtil.printAllRegisteredStudents();
                break;
            case 3:
                studentUtil.findStudentsAndPrint();
                break;
            case 4:
                studentUtil.updateStudentWithSameObject();
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("the entered number is wrong");
        }
    }

    public static String requireName() {
        return inputUtil.requireString("enter name");
    }
    public static String requireSurname() {
        return inputUtil.requireString("enter surname");
    }
    public static int requireAge() {
        return inputUtil.requireNumber("enter age");
    }
    public static String requireClassname() {
        return inputUtil.requireString("enter class name");
    }
    public static void showSuccessOpMessage () {
        System.out.println("operation completed successfully");
    }

}
