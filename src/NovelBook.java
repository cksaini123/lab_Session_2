public class NovelBook extends Book{

    String genre;

    public NovelBook(String isbn, String title, String author, String genre, String type) {
        super(isbn, title, author, type);
        this.genre = genre;
    }
    @Override
    void displayBookDetails() {
        System.out.println("Novel"+genre);
    }
}
