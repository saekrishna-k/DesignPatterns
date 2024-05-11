package Structural.bridge;

public class TreeBreathe implements BreatheImplementor{
    @Override
    public void breatheProcess() {
        System.out.println("breathe through leaves");
        System.out.println("absorb carbon dioxide");
        System.out.println("release oxygen");
    }
}
