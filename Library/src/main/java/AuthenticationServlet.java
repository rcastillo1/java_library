
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


@WebServlet("/AuthenticationServlet")
public class AuthenticationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        List<User> users = LibraryDatabase.getUsers();
        //check whether email and password match
        boolean userAuthentication = false;
        for(User user: users){
            if(email.equals(user.getEmail())&&password.equals(user.getPassword())){
                userAuthentication = true;
                break;
            }
        }
        if (userAuthentication){
            response.sendRedirect("Home.html");
        }else{
            out.println("Wrong username or password");  
        } 
    }
}
