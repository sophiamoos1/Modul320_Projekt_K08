package deliveryHistory;

import packageStation.PackageStation;

import java.util.ArrayList;
import java.util.Date;

public class DeliveryHistory {
    private Status status;
    private ArrayList<? extends PackageStation> stations;
    private Date deliveryDate;

    /**
     * @param status
     * @param stations
     * @param deliveryDate
     */
    public DeliveryHistory(Status status, ArrayList<? extends PackageStation> stations, Date deliveryDate) {
        this.status = status;
        this.stations = stations;
        this.deliveryDate = deliveryDate;
    }

    /**
     * @param status
     * @param stations
     */
    public DeliveryHistory(Status status, ArrayList<? extends PackageStation> stations) {
        this.status = status;
        this.stations = stations;
    }

    public DeliveryHistory(){

    }

    /**
     * @return
     */
    public Status getStatus() {
        return status;
    }

    /**
     * @return
     */
    public ArrayList<? extends PackageStation> getStations() {
        return stations;
    }

    /**
     * @return
     */
    public Date getDeliveryDate() {
        return deliveryDate;
    }
}

enum Status {
    processing,
    delivered,
    undefined,
    shipped
}