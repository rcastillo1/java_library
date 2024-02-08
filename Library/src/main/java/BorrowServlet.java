
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/BorrowServlet")
public class BorrowServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String itemIdString = request.getParameter("itemId");

        if (itemIdString != null && !itemIdString.isEmpty()) {
            int itemId = Integer.parseInt(itemIdString);

            // Check item availability
            if (LibraryDatabase.checkItemAvailability(itemId)) {
                // Create a new BorrowRecord
                BorrowRecord newBorrowRecord = new BorrowRecord(itemId);

                // Add the BorrowRecord to the BorrowRecords list
                LibraryDatabase.addBorrowRecord(newBorrowRecord);

                // Display confirmation message
                PrintWriter out = response.getWriter();
                out.println("<html>");
                out.println("<head><title>Borrow Confirmation</title></head>");
                out.println("<body>");
                out.println("<p>Item " + itemId + " has been successfully borrowed.</p>");
                
                out.println("<form action='LibraryServlet' method='get'>");
                out.println("<input type='submit' value='Back/Continue Borrowing'>");
                out.println("</form>");
                
                out.println("</body>");
                out.println("</html>");

            } else {
                PrintWriter out = response.getWriter();
                out.println("Item unavailability");
            }
        } else {
            PrintWriter out = response.getWriter();
            out.println("Invalid Item");
        }
    }

}