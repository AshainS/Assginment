package db;
public class Student {
    private String regNo;
    private String name;
    private String email;
    private String department;
    private String contact;
    private String district;

    public Student(String regNo, String name, String email, String department, String contact, String district) {
        this.regNo = regNo;
        this.name = name;
        this.email = email;
        this.department = department;
        this.contact = contact;
        this.district = district;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}
