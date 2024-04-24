public class IrrigationDecisionMaker implements DecisionMaker{
    @Override
    public void makeIrrigationDecision(double moistureLevel, String weatherCondition) {
        if (moistureLevel < 30.0 && !weatherCondition.equals("Rainy")) {
            System.out.println("Irrigation is needed due to low moisture level and non-rainy weather.");
        } else {
            System.out.println("No irrigation needed at the moment.");
        }
    }

    @Override
    public void makeFertilizationDecision(String growthStage, String nutrientRequirements, String susceptibilityToDiseases) {
        Wheat wheat = new Wheat(growthStage, nutrientRequirements, susceptibilityToDiseases);
        Tomatoes tomo = new Tomatoes(growthStage, nutrientRequirements, susceptibilityToDiseases);
        Corn corn = new Corn(growthStage, nutrientRequirements, susceptibilityToDiseases);

        if ((corn.getNutrientRequirements().equals("healthy")) || (wheat.getNutrientRequirements().equals("healthy")) || (tomo.getNutrientRequirements().equals("healthy")))
        {
            System.out.println("Irrigation is not needed due to healthy nutrients.");
        }
        else {
            System.out.println("Irrigation is needed");
        }


    }

    @Override
    public void makePestControlDecision(int numberOfPests) {
        if (numberOfPests == 0)
        {
            System.out.println("No pest control is not required");
        }
        if (numberOfPests >= 1)
        {
            System.out.println("Pest control is required");
        }
        if (numberOfPests > 5)
        {
            System.out.println("Pest control is required IMMEDIATELY");
        }
    }
}
