package utility;

import bean.Student;
import exception.StudentDoesntExist;

public interface StudentMgmtInterface {
    public boolean addStudent(Student s);
    public boolean deleteStudent(long rollNo)throws StudentDoesntExist;
    public void listStudents();
    public boolean updateStudent(long rollNo,Student std)throws StudentDoesntExist;
    public Student findTopper();




}
