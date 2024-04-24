public interface ResourceOptimization {
    void optimizeWaterUsage(int irrigationDuration, int irrigationRate, int waterUsed, int numberOfIrrigationSessions);
    void optimizeEnergyUsage(int powerConsumption, int irrigationDuration);
}
