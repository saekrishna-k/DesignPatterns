package Creational.singleton.lazyinitialization;

import java.util.Objects;

public class RedisConnection {
    private static RedisConnection redisConnection;

    private RedisConnection() {
    }

    public static RedisConnection getInstance() {
        if(Objects.isNull(redisConnection)){
            redisConnection = new RedisConnection();
        }
        return redisConnection;
    }
}
