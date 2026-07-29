import java.util.ArrayList;
import java.util.Scanner;

public class Student
{
    static Scanner sc = new Scanner(System.in); // Remove this from here
    private String studentID;
    private String name;
    private String surname;
    private int age;
    private String course;

    //public Student(){}
    public Student(String studentID, String name, String surname, int age, String course)
    {
        this.studentID = studentID;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.course = course;
    }

    public void setStudentID(String studentID)
    {
        this.studentID = studentID;
    }
    public String getStudentID()
    {
        return studentID;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    public String getSurname()
    {
        return surname;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }


    @Override
    public String toString() {
        return "Student ID: " + studentID + "Name: " + name + "Surname: " + surname + "Age: " + age + "Course: " + course;
    }
}
