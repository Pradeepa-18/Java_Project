package exception;

public class InvalidTournament extends RuntimeException
{
    String message;
    public InvalidTournament(String message)
    {
        super(message);
        this.message = message;
    }

    @Override
    public String toString() {
        return "InvalidTournament{" +
                "message='" + message + '\'' +
                '}';
    }
}
