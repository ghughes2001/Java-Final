public interface DecisionMaker {
    void makeIrrigationDecision(double moistureLevel, String weatherCondition);
    void cornFertilizationDecision(String growthStage, String nutrientRequirements, String susceptibilityToDiseases);
    void wheatFertilizationDecision(String growthStage, String nutrientRequirements, String susceptibilityToDiseases);
    void tomatoesFertilizationDecision(String growthStage, String nutrientRequirements, String susceptibilityToDiseases);
    void makePestControlDecision(int numberOfPests);
}
