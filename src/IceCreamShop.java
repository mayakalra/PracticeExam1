public class IceCreamShop {

    String name;
    boolean isOpen;
    int numberOfFlavors;

    public IceCreamShop() {
        System.out.println("Hello World! Good luck on your exams!");
        name = "Scoops & Loops: The Code Creamery";
        isOpen = true;
        numberOfFlavors = 32;
        System.out.println("Welcome to " + name + "! It is " + isOpen + " that we are open. We were founded in " + numberOfFlavors + ".");
        numberOfFlavors = 1900;
        System.out.println("Welcome to " + name + "! It is " + isOpen + " that we are open. We were founded in " + numberOfFlavors + ".");

        randomDiscount();
        specialOfTheDay("chocolate");
        countScoops();
        chefsChoice();
    }

    public static void main(String[] args) {
       IceCreamShop creamery = new IceCreamShop();
    }

    public void randomDiscount() {
        int randomInt = (int)(Math.random() * 30);
        System.out.println("We spun the discount wheel and you get " + randomInt + " percent off your order!");
    }

    public void specialOfTheDay(String flavor) {
        System.out.println("Today's special is " + flavor);
        
    }

    public void countScoops() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);

        }
        for (int y = 2; y <= 11; y = y + 3) {
            System.out.println(y);
        }
        for (int x = 8; x >= 0; x--) {
            System.out.print(x + ", ");
        }
        System.out.println();


    }

    public void chefsChoice() {
        double randomNum = Math.random();

        if (randomNum < 0.25) {
            System.out.println("The chef recommends a Banana Split.");
        }
        if (randomNum >= 0.25 && randomNum <= 0.5) {
            System.out.println("The chef recommends a Turtle Sundae.");
        }
        if (randomNum >= 0.5 && randomNum <= 0.75){
            System.out.println("The chef recommends a Hot Fudge Sundae.");
        }
        if (randomNum >= 0.75 && randomNum <= 1) {
            System.out.println("The chef recommends the Vermonster.");
        }

    }
    IceCream halesOrder = new IceCream(2, "Cookies and Cream", false); {
        System.out.println("Hales Order:");
        halesOrder.printInfo();
    }
    IceCream myOrder = new IceCream(3, "Chocolate", true); {
        System.out.println("My Order:");
        myOrder.printInfo();
    }
}