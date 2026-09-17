```java
import java.util.Scanner;

public class Student {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        System.out.println("\n--- Student Details ---");
        System.out.println("Student Name : " + name);
        System.out.println("Student ID   : " + id);
        System.out.println("Marks        : " + marks);

        if (marks >= 35) {
            System.out.println("Result       : PASS");
        } else {
            System.out.println("Result       : FAIL");
        }

        sc.close();
    }
}
```
