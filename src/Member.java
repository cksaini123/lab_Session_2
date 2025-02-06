public class Member extends User{
    private int borrowedBooksCount;
    private final static int MAX_BORROW_LIMIT = 5;
    public Member(){
        super();
        this.borrowedBooksCount = 0;
    }
    public Member(String contactInfo, String name) {
        super(contactInfo, name);
        this.borrowedBooksCount = 0;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Member Dashboard and Books Borrowed: "+borrowedBooksCount);
    }

    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCount< MAX_BORROW_LIMIT;
    }

    public void returnBook(){
        borrowedBooksCount++;
    }
}
