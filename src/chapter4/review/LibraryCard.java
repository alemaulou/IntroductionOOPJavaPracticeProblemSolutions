package chapter4.review;

public class LibraryCard {
    
    // Data Members
    private Student owner;
    private int borrowCount;
    
    // Constructor
    public LibraryCard() {
        owner = null;
        borrowCount = 0;
    }
    
    // Number of books checked out
    public void checkOut(int bookCount) {
        borrowCount += bookCount;
    }
    
    // Number of books borrowed
    public int getNumberOfBooks() {
        return borrowCount;
    }
    
    // Returns owner student name
    public String getOwnerName() {
        return owner.getName();
    }
    
    // Set owner of library card
   public void setOwner(Student student) {
       owner = student;
   }
   
   // Returns the String representation of the card
   public String toString() {
       return "Owner name is: " + owner.getName() + "\n" +
              "Email: " + owner.getEmail() + "\n" +
              "Books borrowed: " + borrowCount;
   }
}
