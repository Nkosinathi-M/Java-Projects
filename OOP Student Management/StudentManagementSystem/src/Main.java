import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);   // Declaring scanner at class level
    public static void main(String[] args)
    {
        // "224215809", "Nkosinathi", "Mahlangu", 22, "IT"
        ArrayList<Student> students = new ArrayList<>();

        String[][] arrStudent = {
                {"224215809", "Nkosinathi", "Mahlangu", "22", "IT"},
                {"224215809", "Michael", "Mahlangu", "23", "IT"},
                {"224315809", "John", "Mahlangu", "24", "IT"}
        };

        //Student studentObj =  new Student("224215809", "Nkosinathi", "Mahlangu", 22, "IT");
        StudentManager studentManager = new StudentManager();

        /**
         * Add A Student First
         */

        for(int i = 0; i < arrStudent.length; i++)
        {
            int age = Integer.parseInt(arrStudent[i][3]);

            Student student = new Student(
                    arrStudent[i][0],
                    arrStudent[i][1],
                    arrStudent[i][2],
                    age,
                    arrStudent[i][4]
            );
            studentManager.addStudent(student);
        }

        System.out.println("\nViewing All Students");
        studentManager.viewStudents();

        System.out.println("\n Searching for Student ID: 224215809");
        System.out.println(studentManager.searchStudent("224215809"));

        System.out.println("Updating student details");
        studentManager.updateStudentInfo("224315809", 4, "Chemical Engineering");
        studentManager.viewStudents();


        System.out.println("Removing student record");
        studentManager.deleteStudent("224215809");
        studentManager.viewStudents();
        //System.out.println(studentObj.toString());
        //System.out.println(studentObj.getCourse());
    }


}
