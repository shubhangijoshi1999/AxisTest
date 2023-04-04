package Bank.entities;

public class Account {
private int acc_no;
 private String Type;
private float balance;

    public Account(int acc_no, String type, float balance) {
        this.acc_no = acc_no;
        Type = type;
        this.balance = balance;
    }

    Account(){

    }

    public int getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "acc_no=" + acc_no +
                ", Type='" + Type + '\'' +
                ", balance=" + balance +
                '}';
    }
}
