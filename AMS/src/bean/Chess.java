package bean;

import java.util.List;

public class Chess extends Sports{
    public Chess(int sportId, String sportName, String gameType, String winner, List<Player> pp)
    {
        super(sportId, sportName, gameType,"",pp);
    }

    @Override
    public String toString() {
        return "Chess{" +
                "sportId=" + sportId +
                ", SportName='" + SportName + '\'' +
                ", gameType='" + gameType + '\'' +
                ", winner='" + winner + '\'' +
                ", pp=" + pp +
                '}';
    }
}
