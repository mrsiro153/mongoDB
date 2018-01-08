package mongoDB.tableMongo.general;


public class MongoField implements IMongoField {
    private String fieldName;
    private String value;
    private MongoDataType dataType;

    @Override
    public String getFieldName() {
        return fieldName;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public MongoField setValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public MongoDataType getDataType() {
        return dataType;
    }

    public MongoField(String fieldName, MongoDataType dataType) {
        this.fieldName = fieldName;
        this.dataType = dataType;
    }
}
