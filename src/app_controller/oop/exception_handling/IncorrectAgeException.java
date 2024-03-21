package app_controller.oop.exception_handling;

public class IncorrectAgeException extends RuntimeException {

    public IncorrectAgeException(){
        super();
    }

    public IncorrectAgeException(String message){
        super(message);
    }

}
