package mongoDB.tableMongo;

public interface IMongoField {
    String getFieldName();
    String getValue();
    MongoField setValue(String value);
    MongoDataType getDataType();
}
