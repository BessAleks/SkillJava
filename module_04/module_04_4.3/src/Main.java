public class Main {
    public static final double MAX_BOXES = 27.0;
    public static final double MAX_CONTAINERS = 12.0;

    public static void main(String[] args) {
        double boxes = 600.0;
        double containers;
        double trucks;
        double remainsBoxes = 1.0;
        double remailContainers = 1.0;

        containers = Math.ceil(boxes / MAX_BOXES);
        trucks = Math.ceil(containers / MAX_CONTAINERS);
        for (int i = 1; i <= trucks; i++) {
            System.out.println("Грузовик " + i);

            for (double x = 1; x <= containers && x <= MAX_CONTAINERS && remailContainers <= containers ; x++) {
                System.out.println("      Контейнер " + (int) remailContainers);
                remailContainers = remailContainers + 1;

                for (double z = 1; z <= boxes && z <= MAX_BOXES && remainsBoxes <= boxes; z++) {
                    System.out.println("            Ящик " + (int) remainsBoxes);
                    remainsBoxes = remainsBoxes + 1;
                }
            }
        }
    }
}
