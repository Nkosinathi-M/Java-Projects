public abstract class User {
    /**
     * PRIVATE FIELDS
     */
    private String name;
    private String surname;
    private int age;
    private String email;
    private String password;
    private String phoneNumber;
    private boolean active;

    /**
     * CONSTRUCTORS
     * @param name assigned to private fields
     * @param surname assigned to private fields
     * @param age assigned to private fields
     * @param email assigned to private fields
     * @param password assigned to private fields
     * @param phoneNumber assigned to private fields
     */
    public User(String name, String surname, int age, String email, String password, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;

    }

    /**
     * GETTERS AND SETTERS
     * 1. Below are getter and setter
     * @return name, surname, age, email and phone number
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * This contains a method to be overridden
     */
    public abstract void displayMenu();


}
