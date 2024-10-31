public class BankAccount {

    private double amount = 5000;
    public BankAccount(int amount){
this.amount= amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void add(double amount){
        this.amount = this.amount + amount;

    }

    public void draw(double amount){

        if(this.amount >= amount){
            this.amount = this.amount - amount;

        }
       else {
            System.out.println("your amount not enough");
        }
    }
}
