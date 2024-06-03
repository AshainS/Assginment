package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    public void addStudent(Student student) throws SQLException {
        String sql = "INSERT INTO students_list (regNo, name, email, department, contact, district) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = Database.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, student.getRegNo());
            stmt.setString(2, student.getName());
            stmt.setString(3, student.getEmail());
            stmt.setString(4, student.getDepartment());
            stmt.setString(5, student.getContact());
            stmt.setString(6, student.getDistrict());
            stmt.executeUpdate();
        } catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    }
    
    
    public Student getStudentByRegNo(String regNo) throws SQLException {
        Student student = null;
        String sql = "SELECT * FROM students_list WHERE regNo = ?";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, regNo);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String name = rs.getString("name");
                    String email = rs.getString("email");
                    String department = rs.getString("department");
                    String contact = rs.getString("contact");
                    String district = rs.getString("district");
                    student = new Student(regNo, name, email, department, contact, district);
                }
            }
        } catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
        return student;
    }
    

    public List<Student> getAllStudents() throws SQLException {
        List<Student> studentList = new ArrayList<>();
        String sql = "SELECT * FROM students_list";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                String regNo = rs.getString("regNo");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String department = rs.getString("department");
                String contact = rs.getString("contact");
                String district = rs.getString("district");
                studentList.add(new Student(regNo, name, email, department, contact, district));
            }
        } catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
        System.out.println("Fetched students: " + studentList.size()); // Debugging line
        return studentList;
    }

    public void deleteStudent(String regNo) throws SQLException {
        String sql = "DELETE FROM students_list WHERE regNo = ?";
        try (Connection conn = Database.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, regNo);
            stmt.executeUpdate();
        } catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    }
    
    public void updateStudent(Student student) throws SQLException {
        String sql = "UPDATE students_list SET name = ?, email = ?, department = ?, contact = ?, district = ? WHERE regNo = ?";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, student.getName());
            stmt.setString(2, student.getEmail());
            stmt.setString(3, student.getDepartment());
            stmt.setString(4, student.getContact());
            stmt.setString(5, student.getDistrict());
            stmt.setString(6, student.getRegNo());
            stmt.executeUpdate();
        } catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    }

}
