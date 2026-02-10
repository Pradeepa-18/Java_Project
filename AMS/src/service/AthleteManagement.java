package service;

import bean.Player;
import bean.Sports;
import bean.TournamentDetails;
import exception.InvalidTournament;
import exception.NoSportsExist;
import exception.TournamentAlreadyExistException;
import utility.AthleticsManagementInterface;

import java.util.ArrayList;
import java.util.List;

public class AthleteManagement implements AthleticsManagementInterface {
    List<TournamentDetails> td;
    List<Sports> sl;

    public AthleteManagement() {
        this.td = new ArrayList<>();
        this.sl = new ArrayList<>();
    }

    public void addNewTournament(TournamentDetails t) {
        try {
            for (TournamentDetails i : td) {
                if (i.getTournamentID() == t.getTournamentID())
                    throw new TournamentAlreadyExistException("Tournament Already Exist");
            }
        } catch (TournamentAlreadyExistException e) {
            System.out.println(e);
        }
        td.add(t);
    }

    public boolean updateTournamentStatus(int tournamentId, int sportId, String winner) {
        try {
            for (TournamentDetails i : td) {
                if (i.getTournamentID() == tournamentId) {
                    for (Sports s : sl) {
                        if (s.getSportId() == sportId) {
                            s.setWinner(winner);
                            return true;
                        }

                    }
                }
            }
            return false;
          } catch (InvalidTournament e) {
            System.out.println(e);
        }
        return false;
    }
    public List<Sports> retrieveSports(int tournamentId) throws NoSportsExist
    {
        List<Sports> spo = new ArrayList<>();
        for(TournamentDetails i:td)
        {
            if(i.getTournamentID()==tournamentId)
            {
                for(Sports s:sl)
                {
                    if(s.getWinner().equals(""))
                        spo.add(s);
                }
            }
        }
        if(spo.size()==0)
            throw new NoSportsExist("No Sports Exist");
        else
            return spo;
    }
    public int findParticipantCount(int sportId)
    {
        for(TournamentDetails i:td)
        {
            for(Sports s:sl)
            {
                if(s.getSportId()==sportId)
                {
                    return s.getPlayerList().size();
                }
            }
        }
        return 0;
    }
    public List<Player> getAllPlayerwithExperience(int experience)
    {
        List<Player> pl = new ArrayList<>();
        for(TournamentDetails i:td)
        {
            for(Sports s:sl)
            {
                for(Player p: s.getPlayerList())
                {
                    if(p.getExperience()>= experience)
                        pl.add(p);
                }
            }
        }
        return pl;
    }


}
