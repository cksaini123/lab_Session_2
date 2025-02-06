public abstract class User {
    private String userId;
    private String Name;
    private String contactInfo;
    private int totalUser;

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public User() {

        this.userId = generateUniqId();
    }



    public User(String contactInfo, String name) {
        this.userId = generateUniqId();
        this.contactInfo = contactInfo;
        Name = name;
    }
    public User(User c){
        Name = c.Name;
        contactInfo = c.contactInfo;
        this.userId = generateUniqId();
    }
    public final String generateUniqId(){
        totalUser++;
        return "user-"+totalUser;
    }
    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();
    public abstract void returnBook();
}
