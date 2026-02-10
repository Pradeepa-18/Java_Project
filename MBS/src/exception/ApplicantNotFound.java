package exception;

public class ApplicantNotFound extends Exception {
    private String msg;

    public ApplicantNotFound(String msg)
    {
        super(msg);
        this.msg=msg;
    }

    @Override
    public String toString() {
        return "ApplicantNotFound{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
