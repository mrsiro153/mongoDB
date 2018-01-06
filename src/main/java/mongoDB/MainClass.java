package mongoDB;


import io.vertx.core.json.JsonObject;
import mongoDB.tableMongo.txn.BankBranch;

public class MainClass {
    public static void main(String[] args) {
        BankBranch b = new BankBranch();
        b.branchID.setValue("fd fds fds haa fd");
        b.cityCode.setValue("12554.03322");
        System.out.println(b.convertToJsonObject());
    }
}
