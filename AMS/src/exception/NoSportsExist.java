package exception;

public class NoSportsExist extends RuntimeException {
    String message ;
    public NoSportsExist(String message)
    {
        super(message);
        this.message=message;
    }

    @Override
    public String toString() {
        return "NoSportsExist{" +
                "message='" + message + '\'' +
                '}';
    }
}
