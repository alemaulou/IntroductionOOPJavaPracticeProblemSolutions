package chapter4.review;

public class SecondMain {
    public static void main(String[] args) {
        Bicycle bike = new Bicycle();
        Account acc = new Account();
        
        String myName = "Alessandro Lou";
        bike.setOwnerName(myName);
        
        System.out.println("Name of bike owner is " + bike.getOwnerName());
        
        
        acc.setOwnerName("Alessandro Lou");
        System.out.println("The name of the owner of the bank account is " + acc.getOwnerName());
        acc.setInitialBalance(200);
        System.out.println("The initial balanace is set to $" + Math.round(acc.getCurrentBalance()));
        
       acc.add(300);
       System.out.println("Add $300 to balance!");
       System.out.println("After adding $300 to balance, the balance is now " + Math.round(acc.getCurrentBalance()));
    }
}
