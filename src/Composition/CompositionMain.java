package Composition;

public class CompositionMain {

    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27inch Beast",
                "Acer", 27, "2540x1440");
        Motherboard theMotherboard = new Motherboard("BJ-200",
                "Asus", 4, 6, "v2.44");

        PersonalComputer thePC = new PersonalComputer("2208", "Dell",
                theMonitor, theCase, theMotherboard);
        thePC.powerUp();
//        thePC.getComputerCase().pressPowerButton();
//        thePC.getMotherboard().loadProgram("Windows OS");
//        thePC.getMonitor().drawPixelAt(4,12, "Yellow");
    }
}

