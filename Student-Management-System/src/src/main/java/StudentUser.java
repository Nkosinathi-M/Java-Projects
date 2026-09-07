

public class StudentUser extends User {

    /**
     * PRIVATE FIELDS
     */
    private String studentID;
    private String course;

    /**
     * CONSTRUCTORS
     * @param name assigned to private fields
     * @param surname assigned to private fields
     * @param age assigned to private fields
     * @param email assigned to private fields
     * @param password assigned to private fields
     * @param phoneNumber assigned to private fields
     * @param studentID assigned to private fields
     * @param course assigned to private fields
     */
    public StudentUser(String name, String surname, int age, String email, String password, String phoneNumber, String studentID, String course)
    {
        super(name, surname, age, email, password, phoneNumber);
        this.studentID = studentID;
        this.course = course;
    }


    /**
     * GETTERS AND SETTERS
     * 1. Below are getter and setter for studentID, course
     */
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }


    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    /**
     * METHOD: displayMenu()
     * 1. We are overriding this method. It's from User class
     */
    @Override
    public void displayMenu() {
        // We need to add the instructions here
    }

    @Override
    public String toString() {
        return "Student ID: " + studentID + ", Name: " + getName() + ", Surname: " + getSurname() + ", Age: " + getAge() + "Course: " + course;
    }


}
