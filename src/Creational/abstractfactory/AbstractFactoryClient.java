package Creational.abstractfactory;

public class AbstractFactoryClient {
    public static void main(String[] args){
        AbstractFactoryProducer abstractFactoryProducer = new AbstractFactoryProducer();
        AbstractFactory abstractFactory = abstractFactoryProducer.getFactoryInstance("Premium");
        Car car = abstractFactory.getInstance(50000000);
        System.out.println(car.getTopSpeed());
    }
}
