import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;


class STUDENT_ID{
    static String  student_name;
    static BigInteger  student_phone;
    static int student_percentage;
    static String  student_subjects;
    static int  student_paid;
    static int student_pending;
}

public class project {

    static void print() throws IOException{

        File x=new File(STUDENT_ID.student_name+".txt");

        FileWriter y=new FileWriter(x);
        y.write("\n\t\t\tSTUDENT DETAILS:");
        y.write("\n\t\t________________________");
        y.write("\nSTUDENT  NAME:-               "+STUDENT_ID.student_name);      
        y.write("\nSTUDENT PHONE NO:-            "+STUDENT_ID.student_phone);        
        y.write("\nSTUDENT PERCENTAGE :-         "+STUDENT_ID.student_percentage);
        y.write("\nSTUDENT SELECTED SUBJECTS :-  "+STUDENT_ID.student_subjects);
        y.write("\nSTUDENT PAID AMOUNNT :-       "+STUDENT_ID.student_paid);
        y.write("\nSTUDENT PENDING AMOUNT :-     "+STUDENT_ID.student_pending);
        y.close();


        
        Scanner m=new Scanner(x);
        while(m.hasNextLine()){
            System.out.println(m.nextLine());
        }

    }

    static void payment_2() {
        STUDENT_ID v = new STUDENT_ID();
        Scanner a = new Scanner(System.in) ;
        Scanner b = new Scanner(System.in) ;
        System.out.println("\n\t\t\tPAYMENT PROCESSED");
        System.out.println("PRESS ANY KEY TO CONTINUE");
        String x = b.nextLine();
        if(x==x){
            System.out.println("\nYOUR PAYMENT AMOUNT IS Rs.30000(MINIMUM AMOUNT IS 10000)");
            System.out.println("\n\nENTER PAYMENT AMOUNT:");
            int c = a.nextInt();
            v.student_paid = c;
            if(c>=10000 && c<=30000){
                int c_pending =30000 - c;
                v.student_pending = c_pending;
                System.out.println("\n\t\t\tYOUR PAYMENT IS SUCCESSFUL👍");
                System.out.println("\t\t\tYOUR ADMISSION IS SUCCESSFUL PLS CHECK YOUR STUDENT INFO IN MAIN MENU");
            }else{
                System.out.println("\t\t\tPAYMENT FAILURE (INCORRECT AMOUNT)");
            }
        }

    }

    static void COM(){
        Scanner a = new Scanner(System.in) ;
        Scanner b = new Scanner(System.in) ;
        System.out.println("\n\t\t\tYOU HAVE SELECTED COMMERCE STREAM:-");
        System.out.println("\n1.BK\n2.ECONOMICS\n3.MATHS\n4.OC\n5.IT:-");
        String subject[]=new String[5];
        System.out.println("\n\t\t\tENTER YOU SUBJECTS:");
        for (int i = 0; i < 5; i++) {
            System.out.println("ENTER YOUR "+ (i+1) +" SUBJECT:");
            String x=b.nextLine();
            subject[i]=x;
        
        }
        String mn = Arrays.toString(subject);
        STUDENT_ID v = new STUDENT_ID();
        v.student_subjects = mn;
        
        payment_2();
    }


    static void payment_1() {
        STUDENT_ID v = new STUDENT_ID();
        Scanner a = new Scanner(System.in) ;
        Scanner b = new Scanner(System.in) ;
        System.out.println("\n\t\t\tPAYMENT PROCESSED");
        System.out.println("PRESS ANY KEY TO CCONTINUE");
        String x = b.nextLine();
        if(x==x){
            System.out.println("\nYOUR PAYMENT AMOUNT IS Rs.34000(MINIMUM AMOUNT IS 15000)");
            System.out.println("\n\nENTER PAYMENT AMOUNT:");
            int c = a.nextInt();
            v.student_paid = c;
            if(c>=15000 && c<=34000){
                int c_pending =34000 - c;
                v.student_pending = c_pending;
                System.out.println("\n\t\t\tYOUR PAYMENT IS SUCCESSFUL👍");
                System.out.println("\t\t\tYOUR ADMISSION IS SUCCESSFUL PLS CHECK YOUR STUDENT INFO IN MAIN MENU");
            }else{
                System.out.println("\t\t\tPAYMENT FAILURE (INCORRECT AMOUNT)");
            }
        }
        

    }
    
    static void SCIENCE(){
        Scanner a = new Scanner(System.in) ;
        Scanner b = new Scanner(System.in) ;
        System.out.println("\n\t\t\tYOU HAVE SELECTED SCIENCE STREAM:-");
        System.out.println("\n1.IT/HINDI\n2.PHYSICS\n3.MATHS\n4.CHEMISTRY\n5.GEOGRAPHY/BIO:-");
        String subject[]=new String[5];
        System.out.println("\n\t\t\tENTER YOU SUBJECTS:");
        for (int i = 0; i < 5; i++) {
            System.out.println("ENTER YOUR "+ (i+1) +" SUBJECT:");
            String x=b.nextLine();
            subject[i]=x;
        
        }
        String mn = Arrays.toString(subject);
        STUDENT_ID v = new STUDENT_ID();
        v.student_subjects = mn;

        
        
        payment_1();
    }

    static void detail(){
        Scanner a = new Scanner(System.in) ;
        Scanner b = new Scanner(System.in) ;
        System.out.println("\n\n\n\t\t\tSELECT FIELD:-");
        System.out.println("\n\n\t\t1.SCIENCE:\n\t\t2.COMMERCE:"); 
        System.out.println("\nSELECT ANY ONE OPTION:-");
        int m = a.nextInt();

        if(m==1){
            SCIENCE();

        }
        else if(m==2){
            COM();
        }else{
            System.out.println("PLEASE ENTER A VALID OPTION:");
        }
    }
    



    public static void main(String[] args) throws IOException {
        while (true) {
            
        
        Scanner a = new Scanner(System.in) ;
        Scanner b = new Scanner(System.in) ;
       
        System.out.println("\n\n\n\t\t\tMAIN MENU");
        System.out.println("\n\n\t\t1.ADMISSION:\n\t\t2.STUDENT INFO:\n\t\t3.HELP:"); 
        System.out.println("\nSELECT ANY ONE OPTION:-");
        int m = a.nextInt();
        if(m==1){

            STUDENT_ID v = new STUDENT_ID();
            System.out.println("\nENTER YOUR NAME:");
            String x_name = b.nextLine();
            System.out.println("ENTER YOUR PHONE NUMBER:");
            BigInteger x_phone  = a.nextBigInteger();
            System.out.println("ENTER YOUR PERCENTAGE:");
            int x_per = a.nextInt();
            v.student_name=x_name;
            v.student_phone=x_phone;
            v.student_percentage=x_per;

            if(x_per>=45 && x_per<=100){
               detail();
            }
            else{
                System.out.println("ADMISSION NOT APPROVED:");

            }

        }
        else if(m==2){
            print();

        }
        else if(m==3){
            System.out.println("\n\n\t\t\tHELP:");
            System.out.println("\nPERCENTAGE BELOW 45 WILL NOT BE ELIGIBLE FOR ADMISSION");
        }
     }
        
    }
}
