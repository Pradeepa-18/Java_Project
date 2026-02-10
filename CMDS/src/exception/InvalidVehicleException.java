package exception;

public class InvalidVehicleException extends RuntimeException {
    private String message;
    public InvalidVehicleException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String toString() {
        return "InvalidVehicleException{" +
                "message='" + message + '\'' +
                '}';
    }
}
