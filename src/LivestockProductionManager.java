public class LivestockProductionManager {
    public void optimizeFeedingSchedule(Livestock livestock) {
        System.out.println("Optimizing feeding schedule for " + livestock.getType() + "...");

        try {
            Thread.sleep(10000); // 10000ms = 10s
        } catch(InterruptedException ex){

            System.exit(0);
        }
        System.out.println("Feeding schedule has been optimized.");
    }
}
