package test;

import bean.Applicant;
import service.MarriageManagement;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;


public class Driver {
    static int id=101;
    public static void main(String[] args) throws Exception {
        int ch=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MarriageManagement mb=new MarriageManagement();


        do{
            System.out.println();
            System.out.println("1 ---> Add Applicant");
            System.out.println("2 ---> Find Match");
            System.out.println("3 ---> Assign Applicant");
            System.out.println("4 ---> Drop Match");
            System.out.println("5 --->Summary");
            System.out.println("6 ---> Exit");

            System.out.println("Enter your choice: ");
            ch=Integer.valueOf(br.readLine());

            switch(ch)
            {
                case 1:
                    System.out.println("Enter Applicant Name: ");
                    String name = br.readLine();
                    System.out.println("Enter Applicant Age: ");
                    int age = Integer.valueOf(br.readLine());
                    System.out.println("Enter Applicant Sex: ");
                    String sex = br.readLine();

                    mb.addApplicant(new Applicant(id++,name,age,sex.toLowerCase(),null));
                    System.out.println("Your id :" +(id-1));

                    break;

                case 2:
                    System.out.println("Enter id");
                    id=Integer.valueOf(br.readLine());

                    Applicant a=null;
                    for(Applicant i: mb.getAl())
                    {
                        if(i.getApplicantid()==id)
                        {
                            a=i;
                            break;
                        }
                    }

                    System.out.println(mb.findMatch(a));
                    break;

                case 3:
                    System.out.println("Enter id");
                    id=Integer.valueOf(br.readLine());

                    System.out.println("Enter patner id to match : ");
                    int id2=Integer.valueOf(br.readLine());

                    a=null;
                    for(Applicant i: mb.getAl())
                    {
                        if(i.getApplicantid()==id2)
                        {
                            a=i;
                            break;
                        }
                    }

                    mb.assignApplicant(id,a);
                    break;

                case 4:
                    System.out.println("Enter id");
                    id=Integer.valueOf(br.readLine());

                    mb.dropPraposal(id);
                    break;

                case 5:
                    System.out.println(mb.findApplicantSummary());
                    break;

                case 6:
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }while(ch!=6);
    }
}
