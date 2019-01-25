package chapter4.review;

public class Account {
    
    // Data members
    private String ownerName;
    private double balance;
    
    // Constructor
    public Account () {
        ownerName = "";
        balance = 0.0;
    }
    
    public void add(double amt) {
        balance += amt;
    }
    
    public void deduct(double amt) {
        balance -= amt;
    }
  
    public void setInitialBalance(double bal) {
        balance = bal;
    }
    
    public double getCurrentBalance() {
        return balance;
    }
    
    public void setOwnerName(String name) {
        ownerName = name;
    }
    
    public String getOwnerName() {
        return ownerName;
    }
}

