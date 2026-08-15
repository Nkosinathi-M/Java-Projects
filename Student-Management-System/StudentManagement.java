import java.util.Scanner;

public class StudentManagement {
    static Scanner sc = new Scanner(System.in);   // Declaring scanner at class level
    public static void main(String[] args)
    {
        StudentManager manager = new StudentManager();

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

            switch (option)
            {
                case 1:
                    System.out.println("\n################## CAPTURING YOUR INFORMATION ##################");

                    String _studentID = readNonEmptyInput("Enter Student ID: ");
                    String name = readNonEmptyInput("Enter Name: ");
                    String surname = readNonEmptyInput("Enter Surname: ");

                    int age;
                    do{
                        System.out.print("Enter Age: ");
                        age = sc.nextInt();
                        sc.nextLine();

                        if(age < 14 || age > 150)
                        {
                            System.out.println("Age Out Of Bound! \nEnter A Valid Age.");
                        }
                    } while (age < 14 || age > 150);

                    String course = readNonEmptyInput("Enter Course: ");

                    Student objStudent = new Student(_studentID,name, surname, age, course);
                    manager.addStudent(objStudent);
                    break;
                case 2:
                    manager.viewStudents();
                    break;
                case 3:
                    System.out.print("Enter StudentID to search: ");
                    String searchingStudent = sc.nextLine();
                    if (!searchingStudent.isEmpty())
                    {
                        Student searchedStudent = manager.searchStudent(searchingStudent);
                        if(searchedStudent != null)
                        {
                            System.out.println("Student Information");
                            System.out.println("Name:       " + searchedStudent.getName());
                            System.out.println("Surname:    " + searchedStudent.getSurname());
                            System.out.println("Age:        " + searchedStudent.getAge());
                            System.out.println("Course:     " + searchedStudent.getCourse());
                        } else
                        {
                            System.out.println("Not Found");
                        }
                    }
                    break;
                case 4:
                    System.out.print("Enter Student ID to be updated: ");
                    String updateStudentID = sc.nextLine();
                    // Update Student Info Method in this line

                    System.out.println("Choose Option To Be Updated: 1-4 ");
                    System.out.println(" 1. Name ");
                    System.out.println(" 2. Surname");
                    System.out.println(" 3. Age");
                    System.out.println("4. Course");

                    System.out.print("Enter Option: ");
                    int fieldChoice = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter your new value: ");
                    String newValue = sc.nextLine();

                    manager.updateStudentInfo(updateStudentID, fieldChoice, newValue);

                    break;

                case 5:
                    System.out.print("Enter StudentID to Delete: ");
                    String deleteStudentID = sc.nextLine();
                    manager.deleteStudent(deleteStudentID);
                    break;
                default:
                    break;
            }
        } while (option != 6);
    }

    public static String readNonEmptyInput(String thePrompt){

        String input;
        do{
            System.out.print(thePrompt);
            input = sc.nextLine();

            if(input.isEmpty())
            {
                System.out.println("This field cannot be blank. Please try again. ");
            }

        }while(input.isEmpty());

        return input;
    }
}
