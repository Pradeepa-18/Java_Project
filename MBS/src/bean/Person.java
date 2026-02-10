package bean;

public class Person {
    protected int applicantid;
    protected String name;
    protected int age;
    protected String sex;

    public Person(int applicantid, String name, int age, String sex) {
        this.applicantid = applicantid;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public int getApplicantid() {
        return applicantid;
    }

    public void setApplicantid(int applicantid) {
        this.applicantid = applicantid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "applicantid=" + applicantid +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
