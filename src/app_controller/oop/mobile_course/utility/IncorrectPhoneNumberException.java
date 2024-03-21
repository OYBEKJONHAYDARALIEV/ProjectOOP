package app_controller.oop.mobile_course.utility;

public class IncorrectPhoneNumberException extends RuntimeException{

    public IncorrectPhoneNumberException(){
        super();
    }

    public IncorrectPhoneNumberException(String message){
        super(message);
    }


}
