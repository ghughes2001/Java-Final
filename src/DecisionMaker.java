public interface DecisionMaker {
    void makeIrrigationDecision(double moistureLevel, String weatherCondition);
    void makeFertilizationDecision(String growthStage, String nutrientRequirements, String susceptibilityToDiseases);
    void makePestControlDecision(int numberOfPests);
}
