package mongoDB;


import mongoDB.tableMongo.txn.BankBranch;

public class MainClass {
    public static void main(String[] args) {
        BankBranch b = new BankBranch();
        b.branchID.setValue("fd fds fds haa fd");
        b.cityCode.setValue("125540");
        System.out.println(b.convertToJsonObject());
    }
}
