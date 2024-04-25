public class ResourceControl implements ResourceOptimization {
    public void optimizeWaterUsage(int irrigationDuration, int irrigationRate, double waterUsed, int numberOfIrrigationSessions)
    {
        int waterUsePerSession = irrigationDuration * irrigationRate;
        System.out.println("Water used per session is " + waterUsePerSession);

        double totalWaterUsage = waterUsed * numberOfIrrigationSessions;
        System.out.println("Total water used per day is " + totalWaterUsage);
    }
    public void optimizeEnergyUsage(double powerConsumption, double irrigationDuration)
    {
        double totalEnergyUsage = powerConsumption * irrigationDuration;
        System.out.println("Total energy usage per day is " + totalEnergyUsage);
    }
}
