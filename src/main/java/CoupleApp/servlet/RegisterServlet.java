package CoupleApp.servlet;

import CoupleApp.Couple;
import db.MySQLConnect;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Step 1: Get form data from the request
        String email = request.getParameter("email");
        String legalName = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        String status = request.getParameter("status");

        // Step 2: Create a Couple object using your existing class
        Couple couple = new Couple(email, legalName, birthday, status);


        // Step 3: Insert into MySQL (you'll write this method next)
        boolean success = insertCoupleIntoDatabase(couple);

        // Step 4: Send response back to frontend
        response.setContentType("application/json");
        if (success) {
            response.getWriter().write("Registration successful");
        } else {
            response.getWriter().write("Registration failed");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/plain");
        response.getWriter().println("Register servlet is working!");
    }

    private boolean insertCoupleIntoDatabase(Couple couple) {
        try (Connection conn = MySQLConnect.getConnection()) {
            System.out.println("✅ Connected to database");

            String sql = "INSERT INTO couples (email, legal_name, birthday, status) VALUES (?, ?, ?, ?) " +
                    "ON DUPLICATE KEY UPDATE legal_name = VALUES(legal_name), birthday = VALUES(birthday), status = VALUES(status)";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, couple.getEmail());
                stmt.setString(2, couple.getLegalName());
                stmt.setDate(3, couple.getBirthday()); // Must be java.sql.Date
                stmt.setString(4, couple.getStatus());

                int rowsInserted = stmt.executeUpdate();
                System.out.println("✅ Rows inserted: " + rowsInserted);
                return rowsInserted > 0;
            }
        } catch (Exception e) {
            System.out.println("Exception during insert:");
            e.printStackTrace(); // This will show the real error in Tomcat logs
            return false;
        }
    }

}