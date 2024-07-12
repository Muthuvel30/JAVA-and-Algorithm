package Inheritence;

public class person {
    void speak() {
        System.out.println("The person is speaking");
    }
}

class student extends person {
    void speak() {
        System.out.println("Student is asking question");
    }
}

class teacher extends person {
    void speak() {
        System.out.println("The teacher giving lecture");
        super.speak();
    }
}

class in {
    public static void main(String[] args) {
        teacher t = new teacher();
        student s = new student();
        t.speak();
        s.speak();
    }
}