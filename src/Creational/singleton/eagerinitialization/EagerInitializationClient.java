package Creational.singleton.eagerinitialization;

public class EagerInitializationClient {
    public static void main(String[] args){
        DBConnection dbConnection = DBConnection.getInstance();
    }
}
