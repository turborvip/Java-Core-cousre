package _12_4_properties_opject_oriented_program.encapsulation.problem;

public class TransactionHistory {
    public  static  void saveTransaction(){
        int moneyTransfer = 1000000; //wish the fee is 10.000
        Transaction transaction = new Transaction();
        //Toi dang mong muon la ham nay tra ve 10000 nhung boi vi thay doi transactionFee = 0.03 nen no vi pham
        //public static transactionFee = 0.01 co nghia la o dau cung co the truy cap vao de sua cai fee do
        //Vay thuoc tinh dong goi = encapsulation duoc the hien qua access modify private (dong goi thuoc tinh do lai)
        //=> purpose thuoc tinh dong goi la de che dau di nhung thuoc tinh phuong thuc trong doi tuong do.
        transaction.transactionFee = 0.03;
        double money = transaction.getMoneyInMonth(moneyTransfer);
        System.out.println(money);
    }

    public static void main(String[] args) {
        saveTransaction();
    }
}
