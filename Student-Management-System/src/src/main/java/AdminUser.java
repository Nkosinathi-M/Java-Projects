import java.util.ArrayList;

public class AdminUser extends User{
    private ArrayList<StudentUser> studentUserList = new ArrayList<>();

    public void addStudent(StudentUser studentUser) {
        String newID = studentUser.getStudentID();
        StudentUser foundStudentUser = searchStudent(newID);

        if (foundStudentUser != null) {
            System.out.println("Error! StudentUser of StudentUser ID " + foundStudentUser.getStudentID() + " already exists.");
        } else {
            studentUserList.add(studentUser);
            System.out.println("StudentUser Added Successfully!");
        }

    }

    public void viewStudents() {
        if (studentUserList.isEmpty()) {
            System.out.println("No Students Found!");
        } else {
            for (StudentUser s : studentUserList) {
                System.out.println(s.toString());
            }
        }
    }

    public StudentUser searchStudent(String studentID) {
        for (StudentUser s : studentUserList) {
            if (s.getStudentID().equals(studentID)) {
                return s;
            }
        }

        return null;
    }

    public void updateStudentInfo(String studentID, int fieldChoice, String newValue) {
        StudentUser studentUserToBeSearched = searchStudent(studentID);
        if (studentUserToBeSearched != null) {
            switch (fieldChoice) {
                case 1:
                    studentUserToBeSearched.setName(newValue);
                    break;
                case 2:
                    studentUserToBeSearched.setSurname(newValue);
                    break;
                case 3:
                    studentUserToBeSearched.setAge(Integer.parseInt(newValue));
                    break;
                case 4:
                    studentUserToBeSearched.setCourse(newValue);
                    break;
                default:
                    System.out.println("Error! Updating Was Not Successful");
            }
        } else {
            System.out.println("No StudentUser With StudentUser ID " + studentID + " Exists!");
        }
    }

    public void deleteStudent(String studentID) {
        StudentUser studentUserFoundToBeDeleted = searchStudent(studentID);
        if (studentUserFoundToBeDeleted != null) {
            studentUserList.remove(studentUserFoundToBeDeleted);
        } else {
            System.out.println("No StudentUser With StudentUser ID " + studentID + " Exists!");
        }

    }

    @Override
    public void displayMenu(){}
}
