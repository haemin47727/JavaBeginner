package CoupleApp.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import CoupleApp.Couple;
import db.MySQLConnect;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

    @WebServlet("/view")
    public class ViewCouplesServlet extends HttpServlet {
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            List<Couple> couples = new ArrayList<>();

            try (Connection conn = MySQLConnect.getConnection()) {
                String sql = "SELECT id, email, legal_name, birthday, status FROM couples";
                try (PreparedStatement stmt = conn.prepareStatement(sql);
                     ResultSet rs = stmt.executeQuery()) {

                    while (rs.next()) {
                        Couple couple = new Couple(
                                rs.getString("email"),
                                rs.getString("legal_name"),
                                rs.getString("birthday"),
                                rs.getString("status")
                        );
                        couples.add(couple);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            request.setAttribute("couples", couples);
            request.getRequestDispatcher("view.jsp").forward(request, response);
        }

}
