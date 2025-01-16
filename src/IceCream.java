public class IceCream {
    int numberOfScoops;
    String flavor;
    boolean hasSprinkles;


    public IceCream(int paramnumberOfScoops, String paramFlavor, boolean paramhasSprinkles) {
        numberOfScoops = paramnumberOfScoops;
        flavor = paramFlavor;
        hasSprinkles = paramhasSprinkles;
    }// close of constructor

    public void printInfo() {
        System.out.println("Number of scoops: " + numberOfScoops);
        System.out.println("Flavor: " + flavor);
        System.out.println("Has sprinkles: " + hasSprinkles);
    }// close printinfo

}// end of icecream

