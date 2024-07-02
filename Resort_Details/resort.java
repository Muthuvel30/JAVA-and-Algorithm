package Resort_Details;

import java.util.*;

public class resort {
    int Rno;
    String name;
    int days;
    Double charge;
    Scanner s = new Scanner(System.in);

    // resort(int Rno,String name,int days,Double charge){
    // this.Rno=Rno;
    // this.name=name;
    // this.days=days;
    // this.charge=charge;
    // }
    static double compute(int days, double charge) {
        double a = days * charge;
        if (a >= 1100)
            a = 1.02 * days * charge;
        return a;
    }

    public void getinfo() {
        Rno = s.nextInt();
        name = s.next();
        days = s.nextInt();
        charge = s.nextDouble();
    }

    public void display() {
        System.out.println(" Room no: " + Rno + "\n Customer Name: " + name + "\n Number Days: " + days
                + "\n Total charge: " + compute(days, Rno));
    }

    public static void main(String[] args) {
        resort re = new resort();
        re.getinfo();
        re.display();
    }

}
