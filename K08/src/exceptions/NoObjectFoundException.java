package exceptions;

public class NoObjectFoundException extends Exception{
    /**
     * @param message Message which will be defined if the exception will be thrown
     */
    public NoObjectFoundException(String message){
        super(message);
    }
}
