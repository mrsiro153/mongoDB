package mongoDB.tableMongo.general;

public interface IMongoField {
    String getFieldName();
    String getValue();
    MongoField setValue(String value);
    MongoDataType getDataType();
}
