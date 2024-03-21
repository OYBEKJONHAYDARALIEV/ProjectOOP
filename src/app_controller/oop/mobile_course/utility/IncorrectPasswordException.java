package app_controller.oop.mobile_course.utility;

public class IncorrectPasswordException extends RuntimeException{

    public IncorrectPasswordException(){
        super();
    }

    public IncorrectPasswordException(String message){
        super(message);
    }

}
