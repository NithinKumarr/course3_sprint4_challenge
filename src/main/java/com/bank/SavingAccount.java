package com.bank;

public class SavingAccount  extends BankAccount{
    SavingAccount(long accountNumber,String accountOpeningDate, String accountHolderName, String modeOfOperations,
                  String internetBanking, long totalBalance,float rateOfInterest)
    {
        this.accountNumber=accountNumber;
        this.accountOpeningDate=accountOpeningDate;
        this.accountHolderName=accountHolderName;
        this.modeOfOperations=modeOfOperations;
        this.internetBanking=internetBanking;
        this.totalBalance=totalBalance;
        //this.availableBalance=availableBalance;
        this.rateOfInterest=rateOfInterest;
    }
    void showDetails(String name, long accNumber){
        System.out.println("Your Account Details");
        accountHolderName = name;
        accountNumber = accNumber;
        System.out.println("Account Holder Name is : "+accountHolderName);
        System.out.println("Account Number is : "+accountNumber);
        System.out.println("Account Open Date : "+accountOpeningDate);
        System.out.println("Internet Banking and Mobile Banking :"+internetBanking);
        System.out.println("Interest Rate : "+rateOfInterest );
        System.out.println("Mode Of Operation : "+modeOfOperations);

    }

    void showAccountBalance(){
        if(totalBalance>0)
            System.out.println("Balance is :- " +totalBalance);
        else
            System.out.println("Not Enough Balance");
    }
    void withDrawAmount(int debitAmount)
    {
        if(totalBalance>debitAmount)
        {
            long  availableBalance=totalBalance-debitAmount;
            System.out.println("Amount you have Withdraw:-  "+debitAmount);
            System.out.println("NewBalance Balance After Withdraw:-  "+availableBalance);
        }else {
            System.out.println("Sorry you have not Enough Balance");
        }
    }
    void depositAmount(int creditAmount)
    {
        long availableBalance=totalBalance+creditAmount;
        System.out.println("Amount you have Deposit:-  "+creditAmount);
        System.out.println("Remaining Balance After Deposit:-  "+availableBalance);
    }
    void transferAmount(int transferAmount)
    {
        long min = 100000000000L;
        long max = 999999999999L;
        long accountNumberTransfer = (int) (Math.random() * (max - min + 1) + min);
        System.out.println("Fund Transfer to Account Number:- " +accountNumberTransfer);
        availableBalance= (int) (totalBalance-transferAmount);
        System.out.println("Amount you have Transfer:=  "+transferAmount);
        System.out.println("Remaining Balance After Transfer:= "+availableBalance);


    }

}

