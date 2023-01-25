package services;

public class Printer {
    public Printer(){}

    public void printTitle(){
        System.out.println("   ___      _        _                     __       _                         \n" +
                "  / _ \\__ _| | _____| |_  /\\   /\\___ _ __ / _| ___ | | __ _ _   _ _ __   __ _ \n" +
                " / /_)/ _` | |/ / _ \\ __| \\ \\ / / _ \\ '__| |_ / _ \\| |/ _` | | | | '_ \\ / _` |\n" +
                "/ ___/ (_| |   <  __/ |_   \\ V /  __/ |  |  _| (_) | | (_| | |_| | | | | (_| |\n" +
                "\\/    \\__,_|_|\\_\\___|\\__|   \\_/ \\___|_|  |_|  \\___/|_|\\__, |\\__,_|_| |_|\\__, |\n" +
                "                                                      |___/             |___/ " + "\n\n");
    }

    public void printMenu(){
        System.out.println("\nBitte welche Information möchten Sie gerne erhalten?");
        System.out.println("\n-------------------------------------------------------------");
        System.out.println("1.Den Zustellungstatus ansehen");
        System.out.println("2.Die Versendungsperson erfahren");
        System.out.println("3.Die Versendungsadresse erfahren");

    }
}
