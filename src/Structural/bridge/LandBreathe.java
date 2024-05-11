package Structural.bridge;

public class LandBreathe implements BreatheImplementor{
    @Override
    public void breatheProcess() {
        System.out.println("breathe through nose");
        System.out.println("inhale oxygen");
        System.out.println("exhale carbon dioxide");
    }
}
