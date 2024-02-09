
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/LibraryServlet")
public class LibraryServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        List<DVD> dvds = LibraryDatabase.getDVDs();
        List<Book> books = LibraryDatabase.getBooks();
        List<Magazine> magazines = LibraryDatabase.getMagazines();

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Library Items</title></head>");
        out.println("<body>");

        // Display DVDs
        out.println("<h2>DVDs</h2>");
        for (DVD dvd : dvds) {
            out.println("<p>ID: " + dvd.getItemId() + ", Title: " + dvd.getTitle() + ", Year: " + dvd.getYear() + ", Director: " + dvd.getDirector() + ", Genre: " + dvd.getGenre() + "</p>");
        }

        // Display Books
        out.println("<h2>Books</h2>");
        for (Book book : books) {
            out.println("<p>ID: " + book.getItemId() + ", Title: " + book.getTitle() + ", Year: " + book.getYear() + ", Author: " + book.getAuthor() + ", Genre: " + book.getGenre() + "</p>");
        }

        // Display Magazines
        out.println("<h2>Magazines</h2>");
        for (Magazine magazine : magazines) {
            out.println("<p>ID: " + magazine.getItemId() + ", Title: " + magazine.getTitle() + ", Year: " + magazine.getYear() + ", Editor: " + magazine.getEditor() + ", Category: " + magazine.getCategory() + "</p>");
        }
        if ("true".equals(request.getParameter("fetchConfirmation"))) {
            String confirmationMessage = (String) request.getSession().getAttribute("confirmationMessage");
            if (confirmationMessage != null) {
                request.getSession().removeAttribute("confirmationMessage");
                response.getWriter().write(confirmationMessage);
                return;
            }
        }
        //Allow user to enter item ID to borrow items
        out.println("<h2>Borrow Items</h2>");
        out.println("<form action=\"BorrowServlet\" method=\"post\">");
        out.println("Enter Item ID: <input type=\"text\" name=\"itemId\">");
        out.println("<input type=\"submit\" name=\"confirmBorrowing\" value=\"Confirm\">");
        out.println("</form>");
        
        //User Enters ID for returning an item
        out.println("<h2>Borrowed Items</h2>");
        out.println("<form action=\"ReturnServlet\" method=\"get\">");
        //out.println("Enter Item ID: <input type=\"text\" name=\"itemId\">");
        out.println("<input type=\"submit\" value=\"Borrowed Items\">");
        out.println("</form>");

        // Display confirmation message if available
        String confirmationMessage = (String) request.getSession().getAttribute("confirmationMessage");
        if (confirmationMessage != null) {
            out.println("<h2>Confirmation</h2>");
            out.println("<p>" + confirmationMessage + "</p>");
            request.getSession().removeAttribute("confirmationMessage");
        }

        out.println("</body>");
        out.println("</html>");
    }

}
