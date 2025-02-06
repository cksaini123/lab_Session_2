public class TextBook extends Book{

    String subject;
    int edition;

    public TextBook(String isbn, String title, String author, String subject, int edition, String type) {
        super(isbn, title, author, type);
        this.subject = subject;
        this.edition = edition;
    }
    @Override
    void displayBookDetails() {
        System.out.println("text book detail"+subject+"edition= "+edition);
    }
}
