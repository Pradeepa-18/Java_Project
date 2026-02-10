package bean;

import java.util.List;

public class Tennis extends Sports{
    public Tennis(int sportId, String sportName, String gameType, String winner, List<Player> pp) {
        super(sportId, sportName, gameType,"",pp);
    }

    @Override
    public String toString() {
        return "Tennis{" +
                "sportId=" + sportId +
                ", SportName='" + SportName + '\'' +
                ", gameType='" + gameType + '\'' +
                ", winner='" + winner + '\'' +
                ", pp=" + pp +
                '}';
    }
}
