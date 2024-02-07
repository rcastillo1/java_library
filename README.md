  We are designing a library System to manage the operations of a library. This system enables
users to interact with the library's catalog, borrow items, and manage their accounts. It streamlines the
borrowing and returning process.
  The class diagram show how a library system works. In the pictures, you see different classes like
Item, Book, DVD, Magazine, User, and BorrowRecord. Each type has its own details, like the Book class
having author and genre, the DVD class having director and genre etc. This diagram showcases the use of
inheritance in the data model, with the abstract class Item serving as the base class for different types of
library items. It's designated as abstract because items in a library are diverse and need to be
represented by more specific subclasses. It is also a composition where a BorrowRecord is composed of
associations with a User and an Item.
  The sequence diagram shows how the user interacts with the system. When someone uses the
library website, they can do things like looking at all the items, adding new items, logging in, borrowing
items, and returning items. The diagrams show how the website talks to different parts of the system,
like a library manager and a database, to make these actions happen smoothly. The application uses two
main servlets to handle these interactions. LibraryServlet is used to handles general requests related to
library items, such as querying the item catalog or adding new items to the system.
AuthenticationServlet is used to manage user authentication by verifying user with the library's
database. The application is designed to facilitate the following workflow:
  First, users begin by logging into the system, where the AuthenticationServlet verifies the user
against the database records.
  Second, users can request to view all items or add new ones, which the LibraryServlet processes
by fetching data from or updating the database.
Third, when a user decides to borrow or return an item, the LibraryServlet is again engaged to
create or update BorrowRecord entries in the database, ensuring the system reflects the current status
of each item.
Last but not least, after each transaction, users receive confirmations and updates on their
actions, keeping them informed about their interactions with the system.
