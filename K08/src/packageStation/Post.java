package packageStation;

import adress.Adress;

import java.util.Date;

public class Post implements PackageStation{
    private Date arivalDate;
    private Adress address;
    private String stationName;
    private String postStation;
    private Boolean lastStation;
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
        this.arivalDate = arivalDate;
        this.address = address;
        this.stationName = stationName;
        this.postStation = postStation;
        this.lastStation = lastStation;
        this.gotPickedUp = gotPickedUp;
    }



    /**
     * @return
     */
    @Override
    public Date arivalDate() {
        return arivalDate;
    }

    /**
     * @return
     */
    @Override
    public Adress adress() {
        return address;
    }

    /**
     * @return
     */
    @Override
    public String stationName() {
        return stationName;
    }

    /**
     * @return
     */
    @Override
    public Boolean lastStation() {
        return lastStation;
    }

    /**
     * @return
     */
    @Override
    public Boolean gotPickedUp() {
        return gotPickedUp;
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
