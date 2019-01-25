package chapter4.review;

public class Bicycle {
    
    // Data member
    private String ownerName;
    private String tagNo;
    
    // Constructor initializes the data member
    public Bicycle() {
        ownerName = "";
    }
    
    // Returns the name of this bicycle's owner
    public void setOwnerName(String name) {
        ownerName = name;
    }
    
    public void setTagNumber(String tag) {
        tagNo = tag;
    }
    
    public String getTagNo() {
        return tagNo;
    }
    
    // Assigns the name of this bicycle's owner
    public String getOwnerName() {
        return ownerName;
    }
}
