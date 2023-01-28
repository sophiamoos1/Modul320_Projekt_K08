import exceptions.NoObjectFoundException;
import services.Controller;
import services.Storage;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
            controller.runner();
    }
}