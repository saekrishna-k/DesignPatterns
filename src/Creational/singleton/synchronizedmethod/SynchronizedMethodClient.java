package Creational.singleton.synchronizedmethod;

public class SynchronizedMethodClient {
    public static void main(String[] args){
        MongoDBConnection mongoDBConnection = MongoDBConnection.getInstance();
    }
}
