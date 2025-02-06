public abstract class  Book implements Lendable{
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;
    private String type;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean lend(User user) {
        System.out.println("ava"+isAvailable+" borrow"+user.canBorrowBooks());
        if(isAvailable && user.canBorrowBooks()){
            isAvailable = false;
            return true;
        }
        return false;
    }

    @Override
    public void returnBook(User user1) {
        isAvailable = true;
        user1.returnBook();
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }
    abstract void displayBookDetails();

    public Book() {
        this.isAvailable = true;
    }

    public Book(String isbn, String title, String author, String type) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.type = type;
        this.isAvailable = true;
    }

    }
