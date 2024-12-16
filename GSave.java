public class GSave implements BankAccountDecorator{
    
    private SavingsAccount account;

    public GSave(SavingsAccount account) {
        this.account = account;
    }

    @Override
    public void setBankAccount(){
    }

    @Override
    public String showAccountType(){
        return "GSave";
    }

    @Override
    public double getInterestRate(){
        return 0.025;
    }

    
    @Override
    public double computeBalanceWithInterest(){
        return (account.getBalance() * getInterestRate()) + account.getBalance();
    }

    @Override
    public String showBenefits(){
        return account.showBenefits() + ", GCash Transfer";
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