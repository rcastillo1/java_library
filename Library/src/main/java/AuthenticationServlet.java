
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet("/auth")
public class AuthenticationServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle user login requests
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Verify user credentials against the database, e.g., using a UserDAO
        UserDatabase UserDatabase = new UserDatabase();
        User user = UserDatabase.authenticateUser(username, password);

        if (user != null) {
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            response.sendRedirect(request.getContextPath() + "/library");
        } else {
            // Invalid credentials, redirect to login page with an error message
            response.sendRedirect(request.getContextPath() + "/login.jsp?error=1");
        }
    }
}
