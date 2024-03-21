package app_controller.oop.mobile_course.utility;

public class IncorrectNameException extends RuntimeException{

    public IncorrectNameException(){
        super();
    }

    public IncorrectNameException(String message){
        super(message);
    }
}
