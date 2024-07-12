package Inheritence;

class vehic {
    void start() {
        System.out.println("vehical Started");
    }
}

class car extends vehic {
    void drive() {
        System.out.println("car Driving");
    }
}

class sportcar extends car {
    void drive() {
        System.out.println("Sports Car Driving Fast");
    }
}

class dhan {
    public static void main(String[] args) {
        vehic v = new vehic();
        car c = new car();
        sportcar s = new sportcar();
        v.start();
        c.start();
        c.drive();
        s.start();
        s.drive();
    }
}
