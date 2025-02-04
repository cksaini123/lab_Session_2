public abstract class User {
    String userId;
    private String Name;
    private String contactInfo;

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
        this.contactInfo = contactInfo;
        Name = name;
    }
    public User(User c){
        Name = c.Name;
        contactInfo = c.contactInfo;
    }
    public String generateUniqId(){
        return "0";
    }
    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();
}
