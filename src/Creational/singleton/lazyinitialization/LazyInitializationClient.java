package Creational.singleton.lazyinitialization;

public class LazyInitializationClient {
    public static void main(String[] args){
        RedisConnection redisConnection = RedisConnection.getInstance();
    }
}
