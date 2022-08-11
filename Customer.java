public class Customer {
    private int userId;
    private String emailId;
    private String password;
    private String firstName;
    private String city;
    private String gender;
    private String phoneNo;
    private String lastName;
    Address address;

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Address getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        return gender;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public int getUserId() {
        return userId;
    }

}
