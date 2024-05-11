package Creational.singleton.eagerinitialization;

/*
 *   SINGLETON DESIGN PATTERN:
 *   =========================
 *   It is used when we have to create on instance of a class.
 *
 *   Four ways we can achieve this:
 *   =============================
 *   1. Eager Initialization
 *   2. Lazy Initialization
 *   3. Synchronized Method
 *   4. Double Locking (Is mostly used in realtime industry)
 * */

public class DBConnection {
    private static DBConnection dbConnection = new DBConnection();

    private DBConnection() {
    }

    public static DBConnection getInstance() {
        return dbConnection;
    }
}
