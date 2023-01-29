package shippingObject;

import deliveryHistory.DeliveryHistory;
import deliveryHistory.Status;
import packageStation.PackageStation;
import person.Person;

import java.util.ArrayList;
import java.util.Date;

public abstract class ShippingObject {
    private String objectId;
    private Person sendPerson;
    private Person deliverPerson;
    private DeliveryHistory deliveryHistory;

    /**
     * @param objectId
     * @param sendPerson
     * @param deliverPerson
     */
    public ShippingObject(String objectId, Person sendPerson, Person deliverPerson) {
        this.objectId = objectId;
        this.sendPerson = sendPerson;
        this.deliverPerson = deliverPerson;
        this.deliveryHistory = new DeliveryHistory();
    }


    /**
     * @return
     */
    public String getObjectId() {
        return objectId;
    }

    /**
     * @param objectId
     */
    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    /**
     * @return
     */
    public Person getSendPerson() {
        return sendPerson;
    }

    /**
     * @param sendPerson
     */
    public void setSendPerson(Person sendPerson) {
        this.sendPerson = sendPerson;
    }

    /**
     * @return
     */
    public Person getDeliverPerson() {
        return deliverPerson;
    }

    /**
     * @param deliverPerson
     */
    public void setDeliverPerson(Person deliverPerson) {
        this.deliverPerson = deliverPerson;
    }

    /**
     * @param status
     */
    public void setStatus(Status status){
        this.deliveryHistory.setStatus(status);
    }

    /**
     * @param stations
     */
    public void setPackageStations(ArrayList<? extends PackageStation> stations){
        this.deliveryHistory.setStations(stations);
    }

    /**
     * @param deliveryDate
     */
    public void setDeliveryDate(Date deliveryDate){
        this.deliveryHistory.setDeliveryDate(deliveryDate);
    }

    /**
     * @return
     */
    public Status getStatus()
    {
        return this.deliveryHistory.getStatus();
    }

    /**
     * @return
     */
    public ArrayList<? extends PackageStation> getStations() {
        return this.deliveryHistory.getStations();
    }

    /**
     * @return
     */
    public Date getDeliveryDate() {
        return this.deliveryHistory.getDeliveryDate();
    }


    /**
     * @return
     */
    public String formatHistory(){
        String str = "";
        for(int i = 0; i < this.deliveryHistory.getStations().size(); i++){
            PackageStation station = this.deliveryHistory.getStations().get(i);
            String info = " Station: " + station.stationName()
                    + "\n Ankunftsdatum: " + station.arivalDate().toString()
                    + "\n Wurde abgeholt: " + station.gotPickedUp().toString()
                    + "\n Ziel Station : " + station.lastStation().toString()
                    + "\n" + station.adress().returnFormattedAdress() + "\n....................................................\n\n";
            str = str + info;
        }
        return str;
    }

    /**
     * @return
     */
    public String formatObjectInfo(){
        return " Verfolgungsnummer: " + this.objectId
                + "\n Status: " + getStatus().toString();
    }
}
