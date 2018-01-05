package mongoDB;


import io.vertx.core.json.JsonObject;
import mongoDB.tableMongo.txn.BankBranch;

public class MainClass {
    public static void main(String[] args) {
        BankBranch b = new BankBranch()
                .setBankCode("20")
                .setBranchCode("55")
                .setBranchID("2552210")
                .setCityCode("001");

        JsonObject json = JsonObject.mapFrom(b);

        com.google.gson.JsonObject gogo = new com.google.gson.JsonObject().getAsJsonObject(json.encode());
        System.out.println(gogo);
    }
}
