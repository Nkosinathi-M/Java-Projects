import java.util.ArrayList;

public class StudentManager
{
    private ArrayList<Student> studentList = new ArrayList<>();

    public void addStudent(Student student)
    {
        studentList.add(student);
        System.out.println("Student Added Successfully!");
    }

    public void viewStudents()
    {
        if(studentList.isEmpty())
        {
            System.out.println("No Students Found!");
        } else
        {
            for (Student s : studentList)
            {
                System.out.println(s.toString());
            }
        }
    }

    public Student searchStudent(String studentID)
    {
        for(Student s : studentList)
        {
            if(s.getStudentID().equals(studentID))
            {
                return s;
            }
        }

        return null;
    }

    public void updateStudentInfo(String studentID, int fieldChoice, String newValue)
    {
        Student studentToBeSearched = searchStudent(studentID);
        if(studentToBeSearched != null)
        {
            switch (fieldChoice)
            {
                case 1:
                    studentToBeSearched.setName(newValue);
                    break;
                case 2:
                    studentToBeSearched.setSurname(newValue);
                    break;
                case 3:
                    studentToBeSearched.setAge(Integer.parseInt(newValue));
                    break;
                case 4:
                    studentToBeSearched.setCourse(newValue);
                    break;
                default:
                    System.out.println("Error! Updating Was Not Successful");
            }


        } else
        {
            System.out.println("No Student With Student ID " + studentID + " Exists!");
        }
    }

    public void deleteStudent(String studentID)
    {
        Student studentFoundToBeDeleted = searchStudent(studentID);
        if(studentFoundToBeDeleted != null)
        {
            studentList.remove(studentFoundToBeDeleted);
            System.out.println("Student Deleted Successfully.");
        } else
        {
            System.out.println("No Student With Student ID " + studentID + " Exists!");
        }

    }
}
