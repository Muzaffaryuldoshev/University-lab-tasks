package lab_class_9.task_3;

public class Account {
    String owner;
    int balance, accountNum;


    public Account(int balance, int accountNum, String owner) {
        this.balance = balance;
        this.accountNum = accountNum;
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }


    public  void transfer(int  amount) throws NotEnoughFund  {
        if (balance <  amount ) {
            throw new NotEnoughFund( "Lack of Funds for the transfer amount " + amount );
        }
    }

}
