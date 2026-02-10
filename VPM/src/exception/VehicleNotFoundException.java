package exception;

public class VehicleNotFoundException extends Exception {
         private String msg;
         public VehicleNotFoundException(String msg)
         {
             super(msg);
             this.msg = msg;
         }

    @Override
    public String toString() {
        return "VehicleNotFoundException{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
