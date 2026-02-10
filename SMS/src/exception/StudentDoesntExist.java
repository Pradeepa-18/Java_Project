package exception;

public class StudentDoesntExist extends RuntimeException {

    public StudentDoesntExist(String message)
    {
        super(message);
    }

}
