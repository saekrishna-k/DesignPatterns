package Creational.singleton.doublelocking;

import java.util.Objects;

public class CassandraDBConnection {
    private static CassandraDBConnection cassandraDBConnection;

    private CassandraDBConnection() {
    }

    public static CassandraDBConnection getInstance() {
        if (Objects.isNull(cassandraDBConnection)) {
            synchronized (CassandraDBConnection.class) {
                if (Objects.isNull(cassandraDBConnection)) {
                    cassandraDBConnection = new CassandraDBConnection();
                }
            }
        }
        return cassandraDBConnection;
    }
}
