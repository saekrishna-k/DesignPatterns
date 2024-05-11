package Creational.singleton.doublelocking;

public class DoubleCheckingClient {
    public static void main(String[] args){
        CassandraDBConnection cassandraDBConnection = CassandraDBConnection.getInstance();
    }
}
