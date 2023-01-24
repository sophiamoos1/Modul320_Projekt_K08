package packageStation;

import adress.Adress;

import java.util.Date;

public interface PackageStation {
    /**
     * @return
     */
    Date arivalDate();

    /**
     * @return
     */
    Adress adress();

    /**
     * @return
     */
    String stationName();

    /**
     * @return
     */
    Boolean lastStation();

    /**
     * @return
     */
    Boolean gotPickedUp();

}
