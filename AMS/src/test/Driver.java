package test;

import bean.*;
import exception.NoSportsExist;
import service.AthleteManagement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;




public class Driver {
    public static void main(String[] args) {
        AthleteManagement am = new AthleteManagement();
        List<Player> pp1 = new ArrayList<>();
        Player p1 = new Player("Pradeepa",23,3,"MCA");
        Player p2 = new Player("varsha", 23,4,"Btech");
        Player p3 = new Player("Prabakaran",24,3,"Mtech");
        Player p4 = new Player("Shankar",24,2,"Mtech");
        pp1.add(p1);
        pp1.add(p2);
        List<Player> pp2 = new ArrayList<>();
        pp2.add(p3);
        pp2.add(p4);
        Tennis t1 = new Tennis(101, "Tennis", "OutDoor", "", pp1);
        Chess c1 = new Chess(102,"Chess","Indoor","",pp2);
        List<Sports> ls = new ArrayList<>();
        ls.add(t1);
        ls.add(c1);
        LocalDate startDate = LocalDate.now();

        LocalDate endDate = n
        TournamentDetails td1 = new TournamentDetails(1,startDate,endDate,ls);
        TournamentDetails td2 = new TournamentDetails(2,startDate,endDate,ls);
        am.addNewTournament(td1);
        am.addNewTournament(td2);
        am.updateTournamentStatus(1,101,"pradeepa");
        try
        {
            System.out.println(am.retrieveSports(2));
        }
        catch(NoSportsExist e)
        {
            System.out.println(e);
        }
        System.out.println(am.findParticipantCount(101));
        System.out.println(am.getAllPlayerwithExperience(3));





    }
}
