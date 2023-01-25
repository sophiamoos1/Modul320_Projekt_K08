package services;

import shippingObject.ShippingObject;

import java.rmi.NoSuchObjectException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Controller {
    private Printer printer;
    private Storage storage;
    private ArrayList<ShippingObject> shippingObjects;
    public Controller(){
        this.printer = new Printer();
        this.storage = new Storage();
        this.shippingObjects = new ArrayList<ShippingObject>(List.of(storage.getFirstPackage()));
    }

    public void runner(){
        Scanner sc = new Scanner(System.in);
        printer.printTitle();
        System.out.println("Geben Sie die Nummer Ihres Objekts ein");
        ShippingObject object = searchNumberInShippingObjectArray(sc.nextLine());
        System.out.println(object.getSendPerson().getAdress().returnFormattedAdress());


    }

    public ShippingObject searchNumberInShippingObjectArray(String number) {
        for (int i = 0; i <= this.shippingObjects.size(); i++) {
            if (shippingObjects.get(i).getObjectId().equals(number)) {
                return shippingObjects.get(i);
            }
        }
        return null;
    }
}
