package service;

import bean.Applicant;
import exception.ApplicantNotFound;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarriageManagement {

    private List<Applicant> al;

    public MarriageManagement()
    {
        al=new ArrayList<>();
    }

    public boolean addApplicant(Applicant a)
    {
        return al.add(a);
    }

    public List<Applicant> findMatch(Applicant a)throws Exception
    {
        List<Applicant> match=new ArrayList<>();

        for(Applicant i:al)
            if(!i.getSex().equals(a.getSex()) && i.getAge()<=a.getAge())
                match.add(i);

        if(match.size()==0)
            throw new ApplicantNotFound("Match not found");

        return match;
    }

    public boolean assignApplicant(int applicantId, Applicant a)
    {
        Applicant ap=null;
        for(Applicant i:al)
        {
            if(i.getApplicantid()==applicantId) {
                ap = i;
                break;
            }
        }

        if(ap==null)
            return false;

        ap.setPartner(a);

        return true;

    }

    public boolean dropPraposal(int applicantId)
    {
        Applicant ap=null;
        for(Applicant i:al)
        {
            if(i.getApplicantid()==applicantId) {
                ap = i;
                break;
            }
        }

        if(ap==null)
            return false;

        ap.setPartner(null);
        return true;
    }

    public Map<String, Integer> findApplicantSummary()
    {
        Map<String, Integer> mp=new HashMap<>();

        for(Applicant i:al)
        {
            if(i.getSex().equals("male") && i.getPartner()==null)
                mp.put("male", mp.getOrDefault("male",0)+1);
            if(i.getSex().equals("female") && i.getPartner()==null)
                mp.put("female", mp.getOrDefault("female",0)+1);
        }
        return mp;
    }

    public List<Applicant> getAl() {
        return al;
    }
}
