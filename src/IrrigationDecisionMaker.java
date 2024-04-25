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
    public void cornFertilizationDecision(String growthStage, String nutrientRequirements, String susceptibilityToDiseases) {
        Corn corn = new Corn(growthStage, nutrientRequirements, susceptibilityToDiseases);

        if (corn.getNutrientRequirements().equals("healthy"))
        {
            System.out.println("Fertilization is not needed due to healthy nutrients.");
        }
        if (corn.getNutrientRequirements().equals("unhealthy")){
            System.out.println("Fertilization is needed at convenience");
        }
        if (corn.getNutrientRequirements().equals("mildly ill")){
            System.out.println("Fertilization is needed NOW");
        }
        if (corn.getNutrientRequirements().equals("sickly")){
            System.out.println("Fertilization CANNOT wait");
        }
    }
    public void wheatFertilizationDecision(String growthStage, String nutrientRequirements, String susceptibilityToDiseases) {
        Wheat wheat = new Wheat(growthStage, nutrientRequirements, susceptibilityToDiseases);

        if (wheat.getNutrientRequirements().equals("healthy"))
        {
            System.out.println("Fertilization is not needed due to healthy nutrients.");
        }
        if (wheat.getNutrientRequirements().equals("unhealthy")){
            System.out.println("Fertilization is needed at convenience");
        }
        if (wheat.getNutrientRequirements().equals("mildly ill")){
            System.out.println("Fertilization is needed NOW");
        }
        if (wheat.getNutrientRequirements().equals("sickly")){
            System.out.println("Fertilization CANNOT wait");
        }
    }
    public void tomatoesFertilizationDecision(String growthStage, String nutrientRequirements, String susceptibilityToDiseases) {
        Tomatoes tomo = new Tomatoes(growthStage, nutrientRequirements, susceptibilityToDiseases);

        if (tomo.getNutrientRequirements().equals("healthy"))
        {
            System.out.println("Fertilization is not needed due to healthy nutrients.");
        }
        if (tomo.getNutrientRequirements().equals("unhealthy")) {
            System.out.println("Fertilization is needed at convenience");
        }
        if (tomo.getNutrientRequirements().equals("mildly ill")){
            System.out.println("Fertilization is needed NOW");
        }
        if (tomo.getNutrientRequirements().equals("sickly")){
            System.out.println("Fertilization CANNOT wait");
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
