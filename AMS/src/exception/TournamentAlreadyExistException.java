package exception;

public class TournamentAlreadyExistException extends RuntimeException {
    String message;
    public TournamentAlreadyExistException(String message)
    {
        super(message);
        this.message = message;
    }

    @Override
    public String toString() {
        return "TournamentAlreadyExistException{" +
                "message='" + message + '\'' +
                '}';
    }
}
