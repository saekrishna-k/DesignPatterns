package Structural.bridge;

public abstract class LivingThings {
    BreatheImplementor breatheImplementor;

    public LivingThings(BreatheImplementor breatheImplementor) {
        this.breatheImplementor = breatheImplementor;
    }

    abstract void breatheProcess();
}
