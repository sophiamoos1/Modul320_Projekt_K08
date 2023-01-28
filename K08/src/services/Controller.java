package services;

import exceptions.NoObjectFoundException;
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
        boolean stop = false;
        Scanner sc = new Scanner(System.in);
        printer.printTitle();
        do{
            System.out.println("Geben Sie die Nummer Ihres Objekts ein");
            System.out.println("(Um das Programm abzubrechen geben sie ein E ein)");
            String input = sc.nextLine();
            if(input.equals("e")){
                stop = true;
                return;
            }else{
                    ShippingObject object = searchNumberInShippingObjectArray(input);
                    if(object != null){
                        printer.printMenu();
                        String menuInput = sc.nextLine();
                    }else{
                        System.out.println("\nDieses Objekt wurde leider nicht gefunden.\nGeben sie eine andere Nummer ein");
                    }

            }
        }while(!stop);
        printer.printMenu();

    }

    public ShippingObject searchNumberInShippingObjectArray(String number) {
        for (int i = 0; i < this.shippingObjects.size(); i++) {
            if (shippingObjects.get(i).getObjectId().equals(number)) {
                return shippingObjects.get(i);
            }
        }
        return null;
    }
}
