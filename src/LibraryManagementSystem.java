import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    List<Book> bookInventory;
    List<User> registeredUsers;
    LibraryManagementSystem(){
        bookInventory = new ArrayList<Book>();
        registeredUsers = new ArrayList<>();
    }
    public void addBook(Book book){
        bookInventory.add(book);
    }
    public void registerUser(User user){
        registeredUsers.add(user);
    }

    public Book search(String criteria){
        for(Book book: bookInventory){
            if(book.getTitle().equalsIgnoreCase(criteria) || book.getAuthor().equalsIgnoreCase((criteria))){
                return book;
            }
        }
        return null;
    }

    public Book search(String criteria,String type){
        for(Book book: bookInventory){
            if(book.getTitle().equalsIgnoreCase(criteria) || book.getAuthor().equalsIgnoreCase((criteria)) && book.getType().equals(type)){
                return book;
            }
        }
        return null;
    }
}
