package mongoDB.tableMongo.txn;

import mongoDB.mongdoModule.MongoDBRepo;
import mongoDB.tableMongo.general.MongoDataType;
import mongoDB.tableMongo.general.MongoField;

public class TimeLine extends MongoDBRepo{
    public final String getTableName() {
        return "timeLine";
    }
    public final String getDatabaseName() {
        return "transaction";
    }

    public final MongoField id = new MongoField("id", MongoDataType.NUMERIC);
    public final MongoField transactionNumber = new MongoField("transactionNumber",MongoDataType.TEXT);
    public final MongoField rawTransactionType = new MongoField("rawTransactionType",MongoDataType.TEXT);
    public final MongoField refKey = new MongoField("refKey",MongoDataType.TEXT);
    public final MongoField transactionType = new MongoField("transactionType",MongoDataType.TEXT);
    public final MongoField createDate = new MongoField("createDate", MongoDataType.NUMERIC);
    public final MongoField createTime = new MongoField("createTime", MongoDataType.NUMERIC);
    public final MongoField status = new MongoField("status", MongoDataType.NUMERIC);
    public final MongoField prstatus = new MongoField("prstatus", MongoDataType.NUMERIC);
    public final MongoField description = new MongoField("description",MongoDataType.TEXT);
    public final MongoField amount = new MongoField("amount", MongoDataType.NUMERIC);
    public final MongoField feeAmount = new MongoField("feeAmount", MongoDataType.NUMERIC);
    public final MongoField topupNumber = new MongoField("topupNumber",MongoDataType.TEXT);
    public final MongoField billNumber = new MongoField("billNumber",MongoDataType.TEXT);
    public final MongoField currency = new MongoField("currency",MongoDataType.TEXT);
    public final MongoField sourceCIF = new MongoField("sourceCIF",MongoDataType.TEXT);
    public final MongoField sourceName = new MongoField("sourceName",MongoDataType.TEXT);
    public final MongoField refSourceAccountNumber = new MongoField("refSourceAccountNumber",MongoDataType.TEXT);
    public final MongoField sourceAccountNumber = new MongoField("sourceAccountNumber",MongoDataType.TEXT);
    public final MongoField sourceCardNumber = new MongoField("sourceCardNumber",MongoDataType.TEXT);
    public final MongoField destinationCIF = new MongoField("destinationCIF",MongoDataType.TEXT);
    public final MongoField destinationName = new MongoField("destinationName",MongoDataType.TEXT);
    public final MongoField destinationAccountNumber = new MongoField("destinationAccountNumber",MongoDataType.TEXT);
    public final MongoField refDestinationAccountNumber = new MongoField("refDestinationAccountNumber",MongoDataType.TEXT);
    public final MongoField destinationCardNumber = new MongoField("destinationCardNumber",MongoDataType.TEXT);
    public final MongoField destinationBranch = new MongoField("destinationBranch",MongoDataType.TEXT);
    public final MongoField destinationBank = new MongoField("destinationBank",MongoDataType.TEXT);
    public final MongoField destinationCity = new MongoField("destinationCity",MongoDataType.TEXT);
    public final MongoField refTransactionID = new MongoField("refTransactionID",MongoDataType.TEXT);
    public final MongoField preserve01 = new MongoField("preserve01",MongoDataType.TEXT);
    public final MongoField preserve02 = new MongoField("preserve02",MongoDataType.TEXT);
    public final MongoField preserve03 = new MongoField("preserve03",MongoDataType.TEXT);
    public final MongoField transactionBillType = new MongoField("transactionBillType", MongoDataType.NUMERIC);
    public final MongoField transferMoneyType = new MongoField("transferMoneyType", MongoDataType.NUMERIC);
    public final MongoField destinationBankName = new MongoField("destinationBankName",MongoDataType.TEXT);
    public final MongoField ddTxnType = new MongoField("ddTxnType",MongoDataType.TEXT);
    public final MongoField typeDescription = new MongoField("typeDescription",MongoDataType.TEXT);
}
