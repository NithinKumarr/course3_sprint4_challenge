package com.bank;
import java.util.Scanner;
public class RecurringDepositeAccount extends BankAccount{
    double totalRDAmount;
    void showAccountBalance()
    {
        if(totalBalance>0)
            System.out.println("Balance is :- " +totalBalance);
        else
            System.out.println("Not Enough Balance");
    }
    void totalAmountWithInterest(long totalBalance,int noOfYears,float rateOfInterest)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter monthly installment");
        int principal=sc.nextInt();
        double a=(rateOfInterest/100)*(1/12);
        double b=(noOfYears*(noOfYears+1)/2)*a;
        double maturityAmount=(principal*noOfYears)+(principal*b);
        System.out.println("The maturity amount is :=  " +maturityAmount);

        totalRDAmount= totalBalance+maturityAmount;
        System.out.println("The total  amount with interest after Recurring Deposit is:= " +totalRDAmount);
        System.out.println();
        System.out.println("**********THANKS FOR VISITING**********");
        System.out.println();
        System.out.println("*************************visit us again for get many services*******************");
    }
}
