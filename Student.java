public class Student {

    public static void main(String[] args) {

        String name = "Sunil";
        int id = 101;
        int marks = 85;

        System.out.println("--- Student Details ---");
        System.out.println("Student Name : " + name);
        System.out.println("Student ID   : " + id);
        System.out.println("Marks        : " + marks);
        System.out.println("Ok thank you");

        if (marks >= 35) {
            System.out.println("Result       : PASS");
        } else {
            System.out.println("Result       : FAIL");
        }
    }
}

