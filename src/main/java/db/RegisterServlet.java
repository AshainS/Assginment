package db;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");

        if (!password.equals(confirmPassword)) {
            response.sendRedirect("Register.jsp?error=Passwords do not match");
            return;
        }

        try {
            Connection connection = Database.getConnection();
            PreparedStatement stmt = connection.prepareStatement("INSERT INTO user (username, password, confirmPassword) VALUES (?, ?, ?)");
            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.setString(3, confirmPassword);
            stmt.executeUpdate();
            stmt.close();
            connection.close();
            response.sendRedirect("Login.jsp");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            response.sendRedirect("Register.jsp?error=Registration failed");
        }
    }
}
