
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/ReturnServlet")
public class ReturnServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        List<DVD> dvds = LibraryDatabase.getDVDs();
        List<Book> books = LibraryDatabase.getBooks();
        List<Magazine> magazines = LibraryDatabase.getMagazines();
        

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Return Page</title></head>");
        out.println("<body>");
        if(LibraryDatabase.getBorrowRecords().size() != 0) {
        	for(BorrowRecord temps : LibraryDatabase.getBorrowRecords())
            {
            	out.println("<p>Item ID: "+ temps.getItemId() + "</p>");
            }
        }
        else
        {
        	out.println("User has not borrowed items!");
        }
        
        out.println("<form action='LibraryServlet' method='get'>");
        out.println("<input type='submit' value='Return to Borrowing'>");
        out.println("</form>");
        
        out.println("</body>");
        out.println("</html>");
    }

}