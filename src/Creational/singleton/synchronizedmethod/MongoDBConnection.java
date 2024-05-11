package Creational.singleton.synchronizedmethod;

import java.util.Objects;

public class MongoDBConnection {
    private static MongoDBConnection mongoDBConnection;

    private MongoDBConnection() {
    }

    public static synchronized MongoDBConnection getInstance() {
        if (Objects.isNull(mongoDBConnection)) {
            mongoDBConnection = new MongoDBConnection();
        }
        return mongoDBConnection;
    }
}