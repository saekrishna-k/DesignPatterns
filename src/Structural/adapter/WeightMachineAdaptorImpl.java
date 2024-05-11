package Structural.adapter;

public class WeightMachineAdaptorImpl implements WeightMachineAdaptor{

    WeightMachine weightMachine;

    public WeightMachineAdaptorImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKg() {
        double weightInPounds =  weightMachine.getWeightInPounds();
        return weightInPounds * 0.45;
    }
}
