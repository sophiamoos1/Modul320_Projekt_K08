package packageStation;

import adress.Adress;

import java.util.ArrayList;
import java.util.Date;

public class Volg implements PackageStation{
    private ArrayList<String> oppeningHours;
    private Date arivalDate;
    private Adress address;
    private String stationName;
    private String postStation;
    private Boolean lastStation;
    private Boolean gotPickedUp;

    /**
     * @param oppeningHours
     * @param arivalDate
     * @param address
     * @param stationName
     * @param postStation
     * @param lastStation
     * @param gotPickedUp
     */
    public Volg(ArrayList<String> oppeningHours, Date arivalDate, Adress address, String stationName, String postStation, Boolean lastStation, Boolean gotPickedUp) {
        this.oppeningHours = oppeningHours;
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
    public ArrayList<String> getOppeningHours() {
        return oppeningHours;
    }

    /**
     * @param oppeningHours
     */
    public void setOppeningHours(ArrayList<String> oppeningHours) {
        this.oppeningHours = oppeningHours;
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

}
