package mongoDB.mongdoModule;

import com.google.gson.JsonObject;
import com.mongodb.MongoClient;
import mongoDB.exception.BaseException;
import mongoDB.tableMongo.general.MongoField;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;

public class MongoDBRepo implements IMongoDBRepo, Closeable {
    private MongoClient mongoClient;

    public MongoDBRepo() {
        MongoDBConnect connection = new MongoDBConnect()
                .setHost("localhost")
                .setPort(27017);
        mongoClient = connection.createConnection().getMongoClient();
    }

    public MongoClient getMongoClient() {
        return mongoClient;
    }

    @Override
    public void close() throws IOException {
        if (mongoClient != null) {
            mongoClient.close();
        }
    }

    @Override
    public String convertToJsonObject() {
        JsonObject j = new JsonObject();
        try {
            for (Field f : this.getClass().getDeclaredFields()) {
                f.setAccessible(true);
                if(!(f.get(this) instanceof MongoField)){
                    throw new BaseException.InvalidType("not TableField.class");
                }
                MongoField m = (MongoField) f.get(this);
                if (m.getValue() != null) {
                    switch (m.getDataType()){
                        case TEXT:
                        case BOOLEAN:
                            j.addProperty(m.getFieldName(), m.getValue());
                            break;
                        case NUMERIC:
                            j.addProperty(m.getFieldName(),new BigDecimal(m.getValue()));
                            break;
                    }

                }
            }
            return j.toString();
        } catch (Exception e) {
            System.out.println("Unknown error: "+e.toString());
            throw new BaseException.UnknownError(e.toString());
        }
    }

}
