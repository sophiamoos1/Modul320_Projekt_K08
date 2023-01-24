package shippingObject;

import person.Person;

public class Letter extends ShippingObject {
    private envelopType envelop;

    /**
     * @param objectId
     * @param sendPerson
     * @param deliverPerson
     * @param envelop
     */
    public Letter(String objectId, Person sendPerson, Person deliverPerson, envelopType envelop) {
        super(objectId, sendPerson, deliverPerson);
        this.envelop = envelop;
    }

    /**
     * @return
     */
    public envelopType getEnvelop() {
        return envelop;
    }

    /**
     * @param envelop
     */
    public void setEnvelop(envelopType envelop) {
        this.envelop = envelop;
    }
}


enum envelopType {
    A3,
    A4,
    A5,
    A6,

}