package mongoDB.mongdoModule;

import com.mongodb.MongoClient;

import java.io.Closeable;
import java.io.IOException;

public class MongoDBRepo implements IMongoDBRepo, Closeable {
    private MongoClient mongoClient;


    @Override
    public void close() throws IOException {
        if (mongoClient != null) {
            mongoClient.close();
        }
    }
}
