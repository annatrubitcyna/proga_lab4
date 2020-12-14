package exceptions;

public class ThingArrayIndexOutOfBoundsException extends RuntimeException{
    public ThingArrayIndexOutOfBoundsException(String message, Throwable cause){
        super(message, cause);
    }
}
