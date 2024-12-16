public class UpSave implements BankAccountDecorator{
    
    private SavingsAccount account;

    public UpSave(SavingsAccount account) {
        this.account = account;
    }

    @Override
    public void setBankAccount(){
    }

    @Override
    public String showAccountType(){
        return "UpSave";
    }

    @Override
    public double getInterestRate(){
        return 0.04;
    }

    
    @Override
    public double computeBalanceWithInterest(){
        return (account.getBalance() * getInterestRate()) + account.getBalance();
    }

    @Override
    public String showBenefits(){
        return account.showBenefits() + ", With Insurance";
    }

    @Override
    public String showInfo(){

        String info = "Account number: " + account.getAccountNumber() +
                      "\nAccount name: " + account.getAccountName() +
                      "\nBalance: " + account.getBalance();

        return info;
    }

    @Override 
    public double getBalance(){
        return account.getBalance();
    }


    
}