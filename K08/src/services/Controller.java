package services;

import exceptions.NoObjectFoundException;
import shippingObject.ShippingObject;

import javax.swing.text.StyledEditorKit;
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
        this.shippingObjects = new ArrayList<ShippingObject>(List.of(storage.getFirstPackage(), storage.getFirstLetter()));
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
                        getAndPrintInfo(menuInput, object);
                    }else{
                        System.out.println("\nDieses Objekt wurde leider nicht gefunden.\nGeben sie eine andere Nummer ein");
                        return;
                    }

            }
        }while(!stop);
        printer.printMenu();

    }

    /**
     * @param number
     * @return
     */
    public ShippingObject searchNumberInShippingObjectArray(String number) {
        for (ShippingObject object : this.shippingObjects) {
            if (object.getObjectId().equals(number)) {
                return object;
            }
        }
        return null;
    }

    /**
     * @param input
     * @param object
     */
    public void getAndPrintInfo(String input, ShippingObject object){
        switch(input){
            case "1":
                printer.PrintInfo(" Status: " + object.getStatus().toString());
                break;
            case "2":
                printer.PrintInfo(object.getSendPerson().stringPerson());
                break;
            case "3":
                printer.PrintInfo(object.getSendPerson().getAdress().returnFormattedAdress());
                break;
            case "4":
                printer.PrintInfo(object.formatHistory());
                break;
        }
    }
}
