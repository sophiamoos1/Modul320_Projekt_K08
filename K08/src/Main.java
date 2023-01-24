import services.Storage;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        System.out.println(storage.getFirstPackage().getDeliverPerson().getAdress().returnFormattedAdress());
    }
}