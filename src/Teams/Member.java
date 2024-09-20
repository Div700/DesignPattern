package Teams;

public class Member
{
    private String name; // name of the member
    private String email; // email of the member
    private String rollNumber; // roll number of the member
    
    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Member{" + "name=" + name + ", email=" + email + ", rollNumber=" + rollNumber + '}';
    }
    
}
