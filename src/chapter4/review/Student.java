package chapter4.review;

public class Student {
    private String name;
    private String email;
    
    public Student() {
        name = "Unassigned";
        email = "Unassigned";
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String address) {
        email = address;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String studentName) {
        name = studentName;
    }
}
