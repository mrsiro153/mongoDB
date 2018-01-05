package mongoDB.mongdoModule;

import com.mongodb.MongoClient;
import com.mongodb.MongoTimeoutException;

public class MongoDBConnect {
    //singleton this
    private String host;
    private Integer port;
    private MongoClient mongoClient;

    public String getHost() {
        return host;
    }

    public MongoDBConnect setHost(String host) {
        this.host = host;
        return this;
    }

    public Integer getPort() {
        return port;
    }

    public MongoDBConnect setPort(Integer port) {
        this.port = port;
        return this;
    }

    private MongoDBConnect createConnection(){
        try {
            this.mongoClient = new MongoClient(host, port);
        }catch (MongoTimeoutException e){
            System.out.println("Error when create connection to mongo");
        }
        return this;
    }

    public MongoClient getMongoClient() {
        return mongoClient;
    }
}
