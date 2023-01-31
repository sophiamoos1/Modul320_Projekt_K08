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
            printer.printInputMessage();
            String input = sc.nextLine();
            if(input.equals("e")){
                stop = true;
                return;
            }else{
                   try{
                       stop = getInfosFromObject(input);
                   }catch (NoObjectFoundException e){
                       stop = false;
                       printer.printException(e.getMessage());
                   }
            }
        }while(!stop);
    }

    /**
     * @param number    The id of a potential shipping object
     * @return          The object of with the id of param or null
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
     * @param input     Input of the User which should be a id of a existing shipping object
     * @return          A boolean which decides if the process should be stoped or not
     * @throws NoObjectFoundException
     */
    public boolean getInfosFromObject(String input) throws NoObjectFoundException{
        Scanner sc = new Scanner(System.in);
        ShippingObject object = searchNumberInShippingObjectArray(input);
        if(object == null){
            throw new NoObjectFoundException("\nDieses Objekt wurde leider nicht gefunden.\nGeben sie eine andere Nummer ein");
        }else{
            printer.printMenu();
            String menuInput = sc.nextLine();
            return getAndPrintInfo(menuInput, object);
        }
    }

    /**
     * @param input
     * @param object
     */
    public boolean getAndPrintInfo(String input, ShippingObject object){
        switch(input){
            case "1":
                printer.PrintInfo(" Status: " + object.getStatus().toString());
                return false;
            case "2":
                printer.PrintInfo(object.getSendPerson().stringPerson());
                return false;
            case "3":
                printer.PrintInfo(object.getSendPerson().getAdress().returnFormattedAdress());
                return false;
            case "4":
                printer.PrintInfo(object.formatHistory());
                return false;
            case "5":
                printer.PrintInfo(object.formatObjectInfo());
                return false;
            case "6":
                return true;
            default:
                System.out.println("Deine Eingabe entsprach keiner der möglichen Optionen!");
                return false;
        }
    }
}
