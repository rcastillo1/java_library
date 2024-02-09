
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
        
        List<DVD> dvds = LibraryDatabase.getDVDs();
        List<Book> books = LibraryDatabase.getBooks();
        List<Magazine> magazines = LibraryDatabase.getMagazines();
        
        
        
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
                
                switch(itemId)
                {
                case 1:
                case 2:
                case 3:
                	out.println("<p>Item: '" + dvds.get(itemId-1).getTitle() + "' has been successfully borrowed.</p>");
                	break;
                case 4:
                case 5: 
                case 6:
                	out.println("<p>Item: '" + books.get(itemId-4).getTitle() + "' has been successfully borrowed.</p>");
                	break;
                case 7:
                case 8:
                case 9:
                	out.println("<p>Item: '" + magazines.get(itemId-7).getTitle() + "' has been successfully borrowed.</p>");
                	break;
                	default: 
                		out.println("<p>Invalid Item ID</p>");
                		break;
                }
                //out.println("<p>Item " + itemId + " has been successfully borrowed.</p>");
                
                out.println("<form action='LibraryServlet' method='get'>");
                out.println("<input type='submit' value='Back/Continue Borrowing'>");
                out.println("</form>");
                
                out.println("</body>");
                out.println("</html>");

            }
            else
            {
            	if(itemId <= 0 || itemId > 9) 
            	{
            		PrintWriter out = response.getWriter();
                	out.println("<html>");
                	out.println("<body>");
                	out.println("<p>Invalid Item ID</p>");
                	out.println("<form action='LibraryServlet' method='get'>");
                    out.println("<input type='submit' value='Back/Continue Borrowing'>");
                    out.println("</form>");
                	out.println("</body>");
                	out.println("</html>");
            	}
            	else 
            	{
                    PrintWriter out = response.getWriter();
                    //out.println("Item unavailability");
                    out.println("<html>");
                	out.println("<body>");
                	out.println("<p>Item unavailable</p>");
                	
                    switch(itemId)
                    {
                    case 1:
                    case 2:
                    case 3:
                    	out.println("'" + dvds.get(itemId-1).getTitle() + "' not available.");
                    	break;
                    case 4:
                    case 5: 
                    case 6:
                        out.println("'" + books.get(itemId-4).getTitle() + "' not available.");
                    	break;
                    case 7:
                    case 8:
                    case 9:
                        out.println("'" + magazines.get(itemId-7).getTitle() + "' not available.");
                    	break;
                    }
                	out.println("<form action='LibraryServlet' method='get'>");
                    out.println("<input type='submit' value='Back/Continue Borrowing'>");
                    out.println("</form>");
                	out.println("</body>");
                	out.println("</html>");
                    
            	}
            }
        }
    }

}
