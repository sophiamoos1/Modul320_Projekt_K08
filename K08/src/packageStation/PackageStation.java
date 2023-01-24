package packageStation;

import adress.Adress;

import java.util.Date;

public interface PackageStation {
    Date arivalDate();
    Adress adress();

    String stationName();

    Boolean lastStation();

}
