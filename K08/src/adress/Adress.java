package adress;

public class Adress {

    private String street;
    private String houseNumber;
    private int plz;
    private String city;

    /**
     * @param street
     * @param houseNumber
     * @param plz
     * @param city
     */
    public Adress(String street, String houseNumber, int plz, String city) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.plz = plz;
        this.city = city;
    }


    public String returnFormattedAdress(){
        return " Adresse:\n Strasse: " + this.street + " \n Hausnummer: " + this.houseNumber + "\n PLZ: " + this.plz + "\n Stadt: " + this.city;
    }

    /**
     * @return
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * @param houseNumber
     */
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    /**
     * @return
     */
    public int getPlz() {
        return plz;
    }

    /**
     * @param plz
     */
    public void setPlz(int plz) {
        this.plz = plz;
    }

    /**
     * @return
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }
}
