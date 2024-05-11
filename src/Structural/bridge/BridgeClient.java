package Structural.bridge;

/*
 *   BRIDGE DESIGN PATTERN:
 *   =========================
 *   This pattern helps to decouple an abstraction from its implementation, so that two can vary
 *   independently.
 *
 * */

public class BridgeClient {
    public static void main(String[] args){
        LivingThings fishObj = new Fish(new WaterBreathe());
        fishObj.breatheProcess();
    }
}
