package bean;

public class Vehicle {
    protected String regNumber;
    protected String ownerName;
    protected Long mobileNumber;

    public Vehicle(String regNumber, String ownerName, Long mobileNumber) {
        this.regNumber = regNumber;
        this.ownerName = ownerName;
        this.mobileNumber = mobileNumber;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "regNumber='" + regNumber + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", mobileNumber=" + mobileNumber +
                '}';
    }
}
