package utility;

import bean.Sports;
import bean.TournamentDetails;
import exception.NoSportsExist;

import java.util.List;

public interface AthleticsManagementInterface {
    public void addNewTournament(TournamentDetails t);
    public boolean updateTournamentStatus(int tournamentId,int sportId,String winner);
    public List<Sports> retrieveSports(int tournamentId) throws NoSportsExist;
    public int findParticipantCount(int sportId);
    public List getAllPlayerwithExperience(int experience);
}
