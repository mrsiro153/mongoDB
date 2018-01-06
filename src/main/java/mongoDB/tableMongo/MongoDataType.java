package mongoDB.tableMongo;

public enum  MongoDataType {
    NUMERIC(1,"numeric"),
    TEXT(2,"string"),
    BOOLEAN(3,"bool");
    private Integer code;
    private String dataType;

    MongoDataType(Integer code, String dataType) {
        this.code = code;
        this.dataType = dataType;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }
}
