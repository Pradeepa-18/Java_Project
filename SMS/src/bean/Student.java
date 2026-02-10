package bean;

public class Student {
    private long rollno;
    private String name;
    private String address;
    private String subject;
    private int marks[]=new int[6];

    public Student(long rollno, String name, String address, String subject, int[] marks) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
        this.subject = subject;
        this.marks = marks;
    }

    public long getRollno() {
        return rollno;
    }

    public void setRollno(long rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int marks[]) {
        this.marks = marks;
    }
}
