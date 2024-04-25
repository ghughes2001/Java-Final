public interface ResourceOptimization {
    void optimizeWaterUsage(int irrigationDuration, int irrigationRate, double waterUsed, int numberOfIrrigationSessions);
    void optimizeEnergyUsage(double powerConsumption, double irrigationDuration);
}
