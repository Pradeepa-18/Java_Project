package service;

import bean.Student;
import exception.StudentNotFoundException;
import utility.TrainingPlacementInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrainingPlacementService implements TrainingPlacementInterface {
    private List<Student> stud;
    public TrainingPlacementService()
    {
     stud = new ArrayList<>();
    }
    public void addStudent(Student s)
    {
        stud.add(s);
    }
    public List<Student> getEligibleStudents(String branch, float cgpa)
    {
        List<Student> st = new ArrayList<>();

        for(Student s: stud)
        {
            if(s.getBranch().equals(branch) && s.getCgpa()>= cgpa)
                st.add(s);
        }
        return st;
    }
    public int getPlacedStudentsCount() {
        int count = 0;
        for (Student s : stud) {
            if (s.isPlacementStatus())
                count++;
        }
        return count;
    }
    public Student getStudent(int regNo) throws StudentNotFoundException
    {
        for(Student s:stud)
            if(s.getRegNo()==regNo)
                return s;
        throw new StudentNotFoundException("The Given RegisterNo is Not Found");
    }
    public List<Student> updatePlacementStatusAndSort(int regNo,String Company)
    {
        for(Student s:stud)
        {
            if(s.getRegNo()==regNo) {
                s.setCompany(Company);
                s.setPlacementStatus(true);
            }

        }
        stud.sort((x,y)->Float.compare(x.getCgpa(),y.getCgpa()));
        return stud;
    }

}
