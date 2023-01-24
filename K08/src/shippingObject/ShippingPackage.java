package shippingObject;

import person.Person;

public class ShippingPackage extends ShippingObject{
    private String size;
    private Boolean fragile;

    /**
     * @param objectId
     * @param sendPerson
     * @param deliverPerson
     * @param size
     * @param fragile
     */
    public ShippingPackage(String objectId, Person sendPerson, Person deliverPerson, String size, Boolean fragile) {
        super(objectId, sendPerson, deliverPerson);
        this.size = size;
        this.fragile = fragile;
    }

    /**
     * @return
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @return
     */
    public Boolean getFragile() {
        return fragile;
    }

    /**
     * @param fragile
     */
    public void setFragile(Boolean fragile) {
        this.fragile = fragile;
    }
}
