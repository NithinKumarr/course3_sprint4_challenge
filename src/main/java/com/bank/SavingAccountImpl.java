package com.bank;
import java.util.Random;
import java.util.Scanner;
public class SavingAccountImpl {
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("**********************WELCOME TO  SBI BANK************************************");
        System.out.println();
        System.out.println("Enter Details To Open An Account.......");
        System.out.println();
        System.out.println("Enter Applicant Age");
        int age = sc.nextInt();
        if (age >= 18)
        {
            System.out.println("Enter Applicant's Name");
            String name = sc.next();
            System.out.println();
            long initialAmount=10000;
            System.out.println("--BALANCE OF YOUR ACCOUNT IS---" +initialAmount);

            Random obj = new Random();

            long min = 100000000000L;
            long max = 999999999999L;
            long accountNumber = (int) (Math.random() * (max - min + 1) + min);


            float rateOfInterest=8.2f;
            SavingAccount savingAccount = new SavingAccount(accountNumber, "20/10/2020",
                    name, "Self", "Yes",initialAmount,rateOfInterest);

            RecurringDepositeAccount recurringDepositeAccount = new RecurringDepositeAccount();

            System.out.println("****Do you want Saving Account or Recurring Account Choose 1) Saving and 2) Recurring Account***");
            int ch= sc.nextInt();
            if(ch==2)
            {
                System.out.println("Enter Number Of Years");
                int noOfYears = sc.nextInt();
                savingAccount.showDetails(name, accountNumber);
                recurringDepositeAccount.totalAmountWithInterest(initialAmount,noOfYears,rateOfInterest);
            }
            else

                System.out.println("Press 1 to Check Balance, Press 2 to Withdraw Cash, " +
                        "Press 3 to Deposit Cash, Press 4 to Transfer Amount and 0 to exit");

            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    savingAccount.showDetails(name, accountNumber);
                    savingAccount.showAccountBalance();
                    break;
                case 2:
                    System.out.println("Enter The Amount You Want to Withdrawal");
                    int withdrawAmount = sc.nextInt();
                    System.out.println("Details of Customer Account");
                    savingAccount.showDetails(name, accountNumber);
                    savingAccount.withDrawAmount(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Enter The Amount You Want to Deposit");
                    int depositAmount = sc.nextInt();
                    savingAccount.showDetails(name, accountNumber);
                    savingAccount.depositAmount(depositAmount);
                    break;
                case 4:
                    System.out.println("Enter The Amount you Want to Transfer");
                    int transferAmount = sc.nextInt();
                    savingAccount.showDetails(name, accountNumber);
                    savingAccount.transferAmount(transferAmount);
                    break;

                default:
                    System.out.println("You Have Selected Wrong Option ");
                    break;
            }
        }
        else
        {
            System.out.println("*****************SORRY****************You Are Not Eligible to Open An Account");
        }
        System.out.println();
        System.out.println("*************************THANKS FOR VISITING SBI BANK***************************");
        System.out.println();
        System.out.println("*************************visit us again for get many services*******************");
    }
}
