package mongoDB.tableMongo.txn;

import com.google.gson.JsonObject;
import mongoDB.tableMongo.IMongoHelper;
import mongoDB.tableMongo.MongoDataType;
import mongoDB.tableMongo.MongoField;

import java.lang.reflect.Field;


public class BankBranch extends IMongoHelper {
    public static String getTableName() {
        return "bankBranch";
    }

    public final MongoField branchID = new MongoField("branchID", MongoDataType.TEXT);
    public final MongoField branchName = new MongoField("branchName", MongoDataType.TEXT);
    public final MongoField cityCode = new MongoField("cityCode", MongoDataType.TEXT);
    public final MongoField bankCode = new MongoField("bankCode", MongoDataType.TEXT);
    public final MongoField branchCode = new MongoField("branchCode", MongoDataType.TEXT);
    //
}
