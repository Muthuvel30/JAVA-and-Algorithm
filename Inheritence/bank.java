package Inheritence;

class bankaccount {
    int accno;
    double bal;
    double inr;

    bankaccount() {

    }

    bankaccount(int accno, double bal, double inr) {
        this.accno = accno;
        this.bal = bal;
        this.inr = inr;
    }

    double deop(double amo) {
        this.bal = this.bal + amo;
        return bal;
    }

}

class saving extends bankaccount {
    double minbal;

    saving(double d, int accno, float bal, double e) {
        super(accno, bal, e);
        this.minbal = d;
    }

    void withdraw(double d) {
        super.bal -= d;
        System.out.println("Balance: " + super.bal);
    }

    double depo(double amo) {
        super.deop(amo);

        return super.bal;
    }
}

public class bank {
    public static void main(String[] args) {
        saving s = new saving(1050.0, 23145, 10000, 5.0);
        s.withdraw(7654.00);
        double b = s.deop(7654.00);
        System.out.println("Balance Amount: " + b);

    }
}
