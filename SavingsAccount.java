public class SavingsAccount implements BankAccount{

    int accountNumber;
    String accountName;
    double balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    @Override
    public String showAccountType(){
        return "Savings Account";
    }

    @Override
    public double getInterestRate(){
        return 0.01;
    }

    @Override
    public double computeBalanceWithInterest(){
        return (getBalance() * getInterestRate()) + getBalance();
    }

    @Override
    public String showBenefits(){
        return "Standard Savings Account";
    }

    @Override
    public String showInfo(){

        String info = "Account number: " + getAccountNumber() +
                      "\nAccount name: " + getAccountName() +
                      "\nBalance: " + getBalance();

        return info;
    }


}