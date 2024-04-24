import javax.swing.plaf.synth.SynthUI;

public class WasteManagement {
    public void manageWaste(String wasteType) {
        System.out.println("Waste management for " + wasteType + " initiated...");

        try {
            Thread.sleep(10000); // 10000ms = 10s
        } catch(InterruptedException ex){

            System.exit(0);
        }
        System.out.println("...Management for " + wasteType + " has finished");
    }

    public void recycleMaterials(String materialType) {
        System.out.println("Recycling of " + materialType + " initiated...");

        try {
            Thread.sleep(10000); // 10000ms = 10s
        } catch(InterruptedException ex){

            System.exit(0);
        }
        System.out.println("...Recycling for " + materialType + " has finished");
    }
}
