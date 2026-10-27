

public class Student
{

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
        /**
         * Should check here if studentID isEmpty
         * StudentManager: check there is studentID already exits
         */
        if(studentID.isEmpty())
        {
            System.out.println("Please enter your student ID");
        } else {
            this.studentID = studentID;
        }
        this.studentID = studentID;
    }
    public String getStudentID()
    {
        return studentID;
    }

    public void setName(String name)
    {
        if(name.isEmpty())
        {
            System.out.println("Please enter your name");
        } else {
            this.name = name;
        }

    }
    public String getName()
    {
        return name;
    }

    public void setSurname(String surname)
    {
        if(surname.isEmpty())
        {
            System.out.println("Please enter your surname");
        } else {
            this.surname = surname;
        }
    }
    public String getSurname()
    {
        return surname;
    }

    public void setAge(int age)
    {
        if(age == 0)
        {
            System.out.println("Please enter your age");
        } else {
            this.age = age;
        }
    }
    public int getAge()
    {
        return age;
    }

    public void setCourse(String course) {
        if(course.isEmpty())
        {
            System.out.println("Please enter your course");
        } else {
            this.course = course;
        }
    }

    public String getCourse() {
        return course;
    }


    @Override
    public String toString() {
        return "Student Details: {\nStudent ID: " + studentID + "\nName: " + name + "\nSurname: " + surname + "\nAge: " + age + "\nCourse: " + course + "\n}";
    }
}
