package services;

public class Printer {
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_BLACK = "\u001B[30m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_YELLOW = "\u001B[33m";
    public static final String TEXT_BLUE = "\u001B[34m";
    public static final String TEXT_PURPLE = "\u001B[35m";
    public static final String TEXT_CYAN = "\u001B[36m";
    public static final String TEXT_WHITE = "\u001B[37m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public static final String ANSI_RESET = "\u001B[0m";
    public Printer(){}

    public void printTitle(){
        System.out.println(ANSI_YELLOW_BACKGROUND + TEXT_BLACK + "   ___      _        _                     __       _                         \n" +
                "  / _ \\__ _| | _____| |_  /\\   /\\___ _ __ / _| ___ | | __ _ _   _ _ __   __ _ \n" +
                " / /_)/ _` | |/ / _ \\ __| \\ \\ / / _ \\ '__| |_ / _ \\| |/ _` | | | | '_ \\ / _` |\n" +
                "/ ___/ (_| |   <  __/ |_   \\ V /  __/ |  |  _| (_) | | (_| | |_| | | | | (_| |\n" +
                "\\/    \\__,_|_|\\_\\___|\\__|   \\_/ \\___|_|  |_|  \\___/|_|\\__, |\\__,_|_| |_|\\__, |\n" +
                "                                                      |___/             |___/ " + "\n\n"
                + "  __________      __________\n" +
                " |`.      ,'|    |      ()[]|\n" +
                " |  `.__.'  |    |   ____   |\n" +
                " |          |    |   ====   |\n" +
                " |__________|    |__________|" +"\n\n"
                + TEXT_RESET+ANSI_RESET);
    }

    public void printMenu(){
        System.out.println("\nBitte welche Information möchten Sie gerne erhalten?");
        System.out.println("\n-------------------------------------------------------------");
        System.out.println("1. Den Zustellungstatus ansehen");
        System.out.println("2. Die Versendungsperson erfahren");
        System.out.println("3. Die Versendungsadresse erfahren");
        System.out.println("4. Den Zustellungsverlauf ansehen");
        System.out.println("5. Die Obejektinformationen ansehen");
        System.out.println(ANSI_RED_BACKGROUND + "6. Programm beenden" + ANSI_RESET);
        System.out.println("\n(Bitte geben sie die Zahl der Option ein, welche Sie ausführen möchten)");
        System.out.println("\n-------------------------------------------------------------");
    }

    public void PrintInfo(String info){
        System.out.println(ANSI_WHITE_BACKGROUND + TEXT_BLACK + info + "\n\n" + TEXT_RESET +ANSI_RESET);
    }
}
