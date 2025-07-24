// -> It is defined as wrappping of data and information in single unit.

// -> Technically, in encapsulation, the variables or the data in a class is hidden 
// from any other class and can be accessed only 
// through any member function of the class in which they are declared.



package OOPS.Encapsulation;

public class BankAccount {
    //All variable decleare by private cannot access driectly ootside the class
    private String accountHolder ;
    private double bal;

    // Getter for accountHolder

    public String getAccountHolder(){
        return accountHolder;
    }
    // Getter for Balance 
    public Double getBalance(){
        return bal;
    }

    // setter for AccountHolder

    public void setAccountHolder(String name){
        this.accountHolder = name;
    }

    // setter for balnce with validation 

    public void setBalance(double amount){
        if(amount>0){
            this.bal=amount;
        }else{
            System.out.println("Invalid Balance");
        }
    }

}

class Main{
    public static void main(String[] args) {
        
        // create object 
        BankAccount acc = new BankAccount();
        acc.setAccountHolder("Shivam Kumar");
        acc.setBalance(1100);

        System.out.println("Account Holder "+ acc.getAccountHolder());
        System.out.println("Balance : "+ acc.getBalance());

        acc.setBalance(-500); //Rejected 
    
    }
}
