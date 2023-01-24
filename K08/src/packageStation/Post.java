package packageStation;

import adress.Adress;

import java.util.Date;

public class Post implements PackageStation{
    private Date arrivalDate;
    private Adress address;
    private String name;
    private String postStation;
    private Boolean isLastStation;
    private Boolean gotPickedUp;

    /**
     * @param arivalDate
     * @param address
     * @param stationName
     * @param postStation
     * @param lastStation
     * @param gotPickedUp
     */
    public Post(Date arivalDate, Adress address, String stationName, String postStation, Boolean lastStation, Boolean gotPickedUp) {
        this.arrivalDate = arivalDate;
        this.address = address;
        this.name = stationName;
        this.postStation = postStation;
        this.isLastStation = lastStation;
        this.gotPickedUp = gotPickedUp;
    }

    /**
     * @return
     */
    @Override
    public Date arivalDate() {
        return null;
    }

    /**
     * @return
     */
    @Override
    public Adress adress() {
        return null;
    }

    /**
     * @return
     */
    @Override
    public String stationName() {
        return null;
    }

    /**
     * @return
     */
    @Override
    public Boolean lastStation() {
        return null;
    }

    /**
     * @return
     */
    @Override
    public Boolean gotPickedUp() {
        return null;
    }

    /**
     * @return
     */
    public String getPostStation() {
        return postStation;
    }

    /**
     * @param postStation
     */
    public void setPostStation(String postStation) {
        this.postStation = postStation;
    }
}
