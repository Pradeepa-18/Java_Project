package bean;

import java.util.ArrayList;
import java.util.List;

public class Sports {

    protected int sportId;
    protected String SportName;
    protected String gameType;
    protected String winner;
    protected List<Player> pp = new ArrayList<>();

    public Sports(int sportId, String sportName, String gameType, String winner, List<Player> pp) {
        this.sportId = sportId;
        SportName = sportName;
        this.gameType = gameType;
        this.winner = winner;
        this.pp = pp;
    }

    public int getSportId() {
        return sportId;
    }

    public void setSportId(int sportId) {
        this.sportId = sportId;
    }

    public String getSportName() {
        return SportName;
    }

    public void setSportName(String sportName) {
        SportName = sportName;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public List<Player> getPlayerList() {
        return pp;
    }

    public void setPlayerList(List<Player> pp) {
        this.pp = pp;
    }
}
