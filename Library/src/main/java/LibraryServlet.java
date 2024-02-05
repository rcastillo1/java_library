
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@WebServlet("/library")
public class LibraryServlet extends HttpServlet {

    private LibraryDatabase LibraryDatabase = new LibraryDatabase();
    private List<BorrowRecord> borrowRecords = new ArrayList<>();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Item> items = LibraryDatabase.getAllItems(); // Fetch items from the database, e.g., using a DAO
        request.setAttribute("items", items);
        request.setAttribute("borrowRecords", borrowRecords);
        RequestDispatcher dispatcher = request.getRequestDispatcher("library.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("add".equals(action)) {
            handleAddItem(request, response);
        } else if ("borrow".equals(action)) {
            handleBorrowItem(request, response);
        } else if ("return".equals(action)) {
            handleReturnItem(request, response);
        }
    }     
        
    private void handleAddItem(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        int year = Integer.parseInt(request.getParameter("year"));
        String type = request.getParameter("type"); // Assuming a dropdown for item type
        Item newItem = null;

        if ("book".equals(type)) {
            String author = request.getParameter("author");
            String genre = request.getParameter("genre");
            newItem = new Book(generateItemId(), title, year, author, genre);
        } else if ("dvd".equals(type)) {
            String director = request.getParameter("director");
            String genre = request.getParameter("genre");
            newItem = new DVD(generateItemId(), title, year, director, genre);
        } else if ("magazine".equals(type)) {
            String editor = request.getParameter("editor");
            String category = request.getParameter("category");
            newItem = new Magazine(generateItemId(), title, year, editor, category);
        }


        LibraryDatabase.addItem(newItem);
        response.sendRedirect(request.getContextPath() + "/library");
    }
    private void handleBorrowItem(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int userId = Integer.parseInt(request.getParameter("userId"));
        int itemId = Integer.parseInt(request.getParameter("itemId"));
        Date borrowDate = new Date(); // Current date as borrow date

        // Assuming there's a BorrowRecord constructor that takes userId, itemId, and borrowDate
        BorrowRecord borrowRecord = new BorrowRecord(userId, itemId, borrowDate);

        // You would typically add this borrowRecord to your database or a collection
        // For simplicity, let's assume it is stored temporarily in a list
        borrowRecords.add(borrowRecord);

        response.sendRedirect(request.getContextPath() + "/library");
    }

    private void handleReturnItem(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int userId = Integer.parseInt(request.getParameter("userId"));
        int itemId = Integer.parseInt(request.getParameter("itemId"));

        // Find the matching BorrowRecord and set the return date
        for (BorrowRecord borrowRecord : borrowRecords) {
            if (borrowRecord.getUserId() == userId && borrowRecord.getItemId() == itemId && borrowRecord.getReturnDate() == null) {
                borrowRecord.setReturnDate(new Date()); // Current date as return date
                break;
            }
        }

        response.sendRedirect(request.getContextPath() + "/library");
    }
    private int generateItemId() {
        // Logic to generate a unique itemId, e.g., querying the database for the next available ID
        // For simplicity, you can use a simple counter or a random number for demonstration
        return Math.abs(new Random().nextInt());
    }
}