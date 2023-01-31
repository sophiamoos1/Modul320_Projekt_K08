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
     * @return  The envelop of this object
     */
    public envelopType getEnvelop() {
        return envelop;
    }

    /**
     * @param envelop   Value of Enum which is the size of the envelop
     */
    public void setEnvelop(envelopType envelop) {
        this.envelop = envelop;
    }

    /**
     * @return      formated String of some important infos of this object (objectId, Status, devlivery Date, envelop)
     * @Override    Method from ShippingObject
     */
    public String formatObjectInfo(){
        return super.formatObjectInfo() + "\n Umschlagsgrösse: " + this.envelop.toString();
    }
}


