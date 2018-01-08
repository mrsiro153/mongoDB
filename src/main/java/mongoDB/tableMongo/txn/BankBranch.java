package mongoDB.tableMongo.txn;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import mongoDB.mongdoModule.MongoDBRepo;
import mongoDB.tableMongo.general.MongoDataType;
import mongoDB.tableMongo.general.MongoField;
import org.bson.Document;


public class BankBranch extends MongoDBRepo {
    public final String getTableName() {
        return "bankBranch";
    }

    public final String getDatabaseName() {
        return "transaction";
    }

    //
    public final MongoField branchID = new MongoField("branchID", MongoDataType.TEXT);
    public final MongoField branchName = new MongoField("branchName", MongoDataType.TEXT);
    public final MongoField cityCode = new MongoField("cityCode", MongoDataType.TEXT);
    public final MongoField bankCode = new MongoField("bankCode", MongoDataType.TEXT);
    public final MongoField branchCode = new MongoField("branchCode", MongoDataType.TEXT);
    //

    public void insertOne(String data) {
        try (MongoClient mongoClient = new MongoDBRepo().getMongoClient()) {
            MongoDatabase db = mongoClient.getDatabase(getDatabaseName());
            MongoCollection collection = db.getCollection(getTableName());
            //
            Document d = Document.parse(data);
            collection.insertOne(d);
        } catch (Exception e) {
            System.out.println("failed insert to database cause: " + e.getMessage());
        }
    }


}
