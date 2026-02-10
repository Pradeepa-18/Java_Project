package exception;

public class StudentNotFoundException extends RuntimeException {
    String message ;
    public StudentNotFoundException(String message)
    {
        super(message);
        this.message = message;
    }

    @Override
    public String toString() {
        return "StudentNotFoundException{" +
                "message='" + message + '\'' +
                '}';
    }
}
