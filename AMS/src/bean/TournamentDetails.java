package bean;
import java.time.LocalDate;
import java.util.List;

public class TournamentDetails {
    private int tournamentID;
    private LocalDate tournamentStartDate;
    private LocalDate tournamentEndDate;
    private List<Sports> sp;

    public TournamentDetails(int tournamentID, LocalDate tournamentStartDate, LocalDate tournamentEndDate, List<Sports> sp) {
        this.tournamentID = tournamentID;
        this.tournamentStartDate = tournamentStartDate;
        this.tournamentEndDate = tournamentEndDate;
        this.sp = sp;
    }

    public int getTournamentID() {
        return tournamentID;
    }

    public void setTournamentID(int tournamentID) {
        this.tournamentID = tournamentID;
    }

    public LocalDate getTournamentStartDate() {
        return tournamentStartDate;
    }

    public void setTournamentStartDate(LocalDate tournamentStartDate) {
        this.tournamentStartDate = tournamentStartDate;
    }

    public LocalDate getTournamentEndDate() {
        return tournamentEndDate;
    }

    public void setTournamentEndDate(LocalDate tournamentEndDate) {
        this.tournamentEndDate = tournamentEndDate;
    }

    public List<Sports> getSportsList() {
        return sp;
    }

    public void setSportsList(List<Sports> sp) {
        this.sp = sp;
    }
}
