package exception;

public class ParkingSlotNotAvailableException extends Exception{
    private String msg;
    public ParkingSlotNotAvailableException(String msg)
    {
        super(msg);
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ParkingSlotNotAvailableException{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
