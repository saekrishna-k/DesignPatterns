package Structural.adapter;

/*
 *   ADAPTER DESIGN PATTERN:
 *   =========================
 *   This pattern acts as a bridge or intermediate between 2 incompatible interfaces.
 *
 * */

public class AdapterClient {
    public static void main(String[] args){
        WeightMachineAdaptor weightMachineAdaptor = new WeightMachineAdaptorImpl(new WeightMachineImpl());
        System.out.println(weightMachineAdaptor.getWeightInKg());
    }
}
