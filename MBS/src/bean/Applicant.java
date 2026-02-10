package bean;

public class Applicant extends Person{
    private Person partner;


    public Applicant(int applicantid, String name, int age, String sex, Person partner) {
        super(applicantid, name, age, sex);
        this.partner = partner;
    }

    public Person getPartner() {
        return partner;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "partner=" + partner +
                ", applicantid=" + applicantid +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
