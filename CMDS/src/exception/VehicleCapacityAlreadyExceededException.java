package exception;

public class VehicleCapacityAlreadyExceededException extends RuntimeException
{
    private String message;
    public VehicleCapacityAlreadyExceededException(String message) {

        super(message);
        this.message = message;
    }

    @Override
    public String toString() {
        return "VehicleCapacityAlreadyExceededException{" +
                "message='" + message + '\'' +
                '}';
    }
}
