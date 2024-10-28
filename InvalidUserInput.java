package CourseRegistrationSystem;

//Defining custom Exception that is thrown when invalid choice is given by user

public class InvalidUserInput extends RuntimeException{
    public InvalidUserInput(String message) {
        super(message);        
    }

    public InvalidUserInput(String message, Throwable cause) {
        super(message, cause);
    }
}