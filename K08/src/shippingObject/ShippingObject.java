package shippingObject;

import person.Person;

public abstract class ShippingObject {
    private String objectId;
    private Person sendPerson;
    private Person deliverPerson;

    /**
     * @param objectId
     * @param sendPerson
     * @param deliverPerson
     */
    public ShippingObject(String objectId, Person sendPerson, Person deliverPerson) {
        this.objectId = objectId;
        this.sendPerson = sendPerson;
        this.deliverPerson = deliverPerson;
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
}
