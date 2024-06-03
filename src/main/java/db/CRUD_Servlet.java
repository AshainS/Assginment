package db;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CRUD_Servlet")
public class CRUD_Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    private StudentDAO studentDAO = new StudentDAO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if ("add".equals(action)) {
            addStudent(request, response);
        } else if ("update".equals(action)) {
            updateStudent(request, response);
        }else if ("view".equals(action)) {
        	listStudents(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "list";
        }
        switch (action) {
            case "list":
                listStudents(request, response);
                break;
            case "edit":
                showEditForm(request, response);
                break;
            case "delete":
                deleteStudent(request, response);
                break;
            default:
                listStudents(request, response);
                break;
        }
    }

    private void addStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String regNo = request.getParameter("regNo");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String department = request.getParameter("department");
        String contact = request.getParameter("contact");
        String district = request.getParameter("district");
        Student student = new Student(regNo, name, email, department, contact, district);
        try {
            studentDAO.addStudent(student);
        } catch (SQLException e) {
            throw new ServletException("Error adding student", e);
        }
        response.sendRedirect("CRUD_Servlet");
    }

    private void updateStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String regNo = request.getParameter("regNo");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String department = request.getParameter("department");
        String contact = request.getParameter("contact");
        String district = request.getParameter("district");

        Student student = new Student(regNo, name, email, department, contact, district);
        try {
            studentDAO.updateStudent(student);
        } catch (SQLException e) {
            throw new ServletException("Error updating student", e);
        }
        response.sendRedirect("CRUD_Servlet");
    }

    private void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String regNo = request.getParameter("regNo");
        try {
            studentDAO.deleteStudent(regNo);
        } catch (SQLException e) {
            throw new ServletException("Error deleting student", e);
        }
        response.sendRedirect("CRUD_Servlet");
    }

    private void listStudents(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> studentList;
        try {
            studentList = studentDAO.getAllStudents();
        } catch (SQLException e) {
            throw new ServletException("Error listing students", e);
        }
        request.setAttribute("studentList", studentList);
        request.getRequestDispatcher("/StuDetails.jsp").forward(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String regNo = request.getParameter("regNo");
        Student existingStudent;
        try {
            existingStudent = studentDAO.getStudentByRegNo(regNo);
        } catch (SQLException e) {
            throw new ServletException("Error fetching student", e);
        }
        request.setAttribute("student", existingStudent);
        request.getRequestDispatcher("/EditStudent.jsp").forward(request, response); 
    }
}
