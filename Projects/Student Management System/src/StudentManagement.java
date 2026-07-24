import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n################## CAPTURING YOUR INFORMATION ##################");
        System.out.print("Enter Student ID: ");
        String studentID = sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Surname: ");
        String surname = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        /**
         * MAIN MENU OPTIONS
         */
        int option = 0;
        do {
            System.out.println("\n################## MAIN MENU: SMS ##################");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search student by ID");
            System.out.println("4. Update student details");
            System.out.println("5. Delete student");
            System.out.println("6. Exit Program");

            System.out.print("Enter Option: ");
            int opt = sc.nextInt();
            sc.nextLine();
            option = opt;

            Student objStudent = new Student(studentID,name, surname, age, course);
            StudentManager manager = new StudentManager();

            switch (option)
            {
                case 1:
                    manager.addStudent(objStudent);
                    break;
                case 2:
                    manager.viewStudents();
                    break;
                case 3:
                    manager.searchStudent(studentID);
                    break;
                case 4:
                    System.out.println("Enter Student ID to be updated: ");
                    String student_ID = sc.nextLine();
                    // Update Student Info Method in this line

                    System.out.println("Choose Option To Be Updated: 1-5 ");
                    System.out.println(" 1. Name");
                    System.out.println(" 2. Surname ");
                    System.out.println(" 3. Age");
                    System.out.println(" 4. Course");

                    System.out.print("Enter Option: ");
                    int fieldChoice = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter your new value: ");
                    String newValue = sc.nextLine();

                    manager.updateStudentInfo(student_ID, fieldChoice, newValue);
                    break;
                default:
                    manager.deleteStudent(studentID);
            }

        } while (option != 6);




//        System.out.println("\n*******STUDENT MANAGEMENT SYSTEM*******");
//        System.out.println("Student ID:      " + objStudent.getStudentID());
//        System.out.println("Name:            " + objStudent.getName());
//        System.out.println("Surname:         " + objStudent.getSurname());
//        System.out.println("Age:             " + objStudent.getAge());
//        System.out.println("Course:          " + objStudent.getCourse());
//        System.out.println();
//        System.out.println("####################### END OF RESULTS #######################");
    }
}
