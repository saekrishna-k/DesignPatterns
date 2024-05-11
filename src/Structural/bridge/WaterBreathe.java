package Structural.bridge;

public class WaterBreathe implements BreatheImplementor{
    @Override
    public void breatheProcess() {
        System.out.println("breathe through gill");
        System.out.println("absorb oxygen");
        System.out.println("release carbon dioxide");
    }
}
