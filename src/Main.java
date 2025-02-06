//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LibraryManagementSystem Lm = new LibraryManagementSystem();
        Book book1 = new TextBook("123","I am great", "teena",  "Science", 1, "book");
        Book book2 = new NovelBook("456","who are you?","teena saini","comic","novel");

        User user1 = new Member("9611343812","Mukesh");
        User user2 = new Librarian("7338585222","singh","90");

        Lm.addBook(book1);
        Lm.addBook(book2);
        Lm.registerUser(user1);
        Lm.registerUser(user2);
        boolean val = book1.lend(user1);
        //System.out.println(val);
        if(val) {
            System.out.println("successfully lendended");
        }

        boolean val2 = book1.lend(user2);
        if(val2){
            System.out.println("successfully");
        }else{
            System.out.println("UNsuccessfully");
        }
        book1.returnBook(user1);

    }
}