public class Librarian extends User{
    private String employeeNumber;


    public Librarian(String contactInfo, String name, String employeeNumber) {
        super(contactInfo, name);
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard and the "+employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    @Override
    public void returnBook() {
    }

    void addNewBook(Book book){

    }

    void removeBook(Book book){

    }
}
