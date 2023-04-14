package _12_4_properties_opject_oriented_program.encapsulation.problem;

public class Transaction {
    public double transactionFee = 0.01;

    public double getMoneyInMonth(int moneyTransfer){
        return moneyTransfer * transactionFee;
    }
}
