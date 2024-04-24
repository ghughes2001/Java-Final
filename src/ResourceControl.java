public class ResourceControl implements ResourceOptimization {
    public void optimizeWaterUsage(int irrigationDuration, int irrigationRate, int waterUsed, int numberOfIrrigationSessions)
    {
        int waterUsePerSession = irrigationDuration * irrigationRate;
        System.out.println("Water used per session is " + waterUsePerSession);

        int totalWaterUsage = waterUsed * numberOfIrrigationSessions;
        System.out.println("Total water used per day is " + totalWaterUsage);
    }
    public void optimizeEnergyUsage(int powerConsumption, int irrigationDuration)
    {
        int totalEnergyUsage = powerConsumption * irrigationDuration;
        System.out.println("Total energy usage per day is " + totalEnergyUsage);
    }
}
