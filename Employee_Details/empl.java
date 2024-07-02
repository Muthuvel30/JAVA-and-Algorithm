package Employee_Details;

import java.util.*;

class de {
    String name;
    int id;
    int salary;
    String dep;

    de(String name, int id, int salary, String dep) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.dep = dep;
    }

    public void empldet() {
        System.out.print(" empolye name: " + this.name + "\n employe id: " + this.id + "\n employe salary: "
                + this.salary + "\n employe department: " + this.dep);
    }

}

public class empl {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        de n = new de(s.next(), s.nextInt(), s.nextInt(), s.next());
        n.empldet();
        s.close();
    }

}
