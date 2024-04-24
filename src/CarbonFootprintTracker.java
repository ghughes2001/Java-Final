import java.util.Random;

public class CarbonFootprintTracker implements CarbonFootprint {
    double upperBound = 15.0;

    Random rand = new Random();
    double carbonWeight = rand.nextDouble(upperBound);

    @Override
    public void reduceEmissions() {
        double carbonEmission = trackEmissions();

        if (carbonEmission == 15) {
            System.out.println("Carbon Emissions level at 15.0, WAY TOO HIGH. Increasing covering over crops IMMEDIATELY");
            carbonEmission /= 2;
        }
        if (carbonEmission <= 5.0) {
            System.out.println("PERFECT! Carbon Emission is at a PERFECT level");
        }
        if (carbonEmission > 5.0) {
            System.out.println("Carbon Emission needs to be lower. Asking someone to cover the crops");
        }
    }

    @Override
    public double trackEmissions() {
        double carbon = carbonWeight * 0.87;

        System.out.println("Carbon emissions from farm activities is " + carbon);

        return carbon;
    }
}