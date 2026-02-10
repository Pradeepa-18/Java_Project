package utility;

import bean.Student;
import exception.StudentNotFoundException;

import java.util.List;

public interface TrainingPlacementInterface {
    public List<Student> getEligibleStudents(String branch, float cgpa);
    public int getPlacedStudentsCount();
    public Student getStudent(int regNo) throws StudentNotFoundException;
    public List<Student> updatePlacementStatusAndSort(int regNo,String Company);
}
