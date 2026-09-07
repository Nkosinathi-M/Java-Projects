

public class AdminUser extends User{
    /**
     * PRIVATE FIELD(S)
     */
    private String adminID;

    /**
     * CONSTRUCTORS
     * @param name assigned to private fields
     * @param surname assigned to private fields
     * @param age assigned to private fields
     * @param email assigned to private fields
     * @param password assigned to private fields
     * @param phoneNumber assigned to private fields
     * @param adminID assigned to private fields
     */
    public AdminUser(String name, String surname, int age, String email, String password, String phoneNumber, String adminID) {
        super(name, surname, age, email, password, phoneNumber);
        this.adminID = adminID;
    }

    /**
     * GETTER AND SETTER
     * 1. Below are getter and setter
     * @return adminID
     */
    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    /**
     * METHOD: displayMenu()
     * 1. We are overriding this method. It's from User class
     */
    @Override
    public void displayMenu()
    {
        // We need to add the instructions here and modify

    }

    @Override
    public String toString() {
        return "AdminUser{" +
                "adminID= " + adminID + '\'' +
                "Admin Name= " + getName() + '\'' +
                "Admin Surname= " + getSurname() + '\'' +
                "Admin Age= " + getAge() + '\'' +
                "Admin Email= " + getEmail() + '\'' +
                "Admin Phone Number= " + getPhoneNumber() + '\'' +
                '}';
    }
}
