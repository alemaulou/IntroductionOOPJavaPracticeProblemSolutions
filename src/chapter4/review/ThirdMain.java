package chapter4.review;

public class ThirdMain {
    
    public static void main(String[] args) {
        Student alessandroStudent = new Student();
        LibraryCard alessandroLibraryCard = new LibraryCard();
        
        Student richardStudent = new Student();
        LibraryCard richardLibraryCard = new LibraryCard();
        
        alessandroStudent.setName("Alessandro");
        alessandroStudent.setEmail("alessandro@domain.com");
        alessandroLibraryCard.setOwner(alessandroStudent);
        alessandroLibraryCard.checkOut(5);
        
        richardStudent.setName("Richard");
        richardStudent.setEmail("richard@domain.com");
        richardLibraryCard.setOwner(richardStudent);
        richardLibraryCard.checkOut(20);
        
        System.out.println("Library card #1: ");
        System.out.println(alessandroLibraryCard.toString());
        System.out.println();
        System.out.println("Library card #2: ");
        System.out.println(richardLibraryCard.toString());
    }
}
