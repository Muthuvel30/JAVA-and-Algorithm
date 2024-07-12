package Interface;

interface person {
    void speak();
}

interface student {
    void question();
}

class teacher implements student, person {
    @Override
    public void speak() {
        System.out.println("The teacher giving lecture");
    }

    @Override
    public void question() {
        System.out.println("The teacher giving lecture");
    }
}

class in {
    public static void main(String[] args) {
        teacher t = new teacher();
        t.speak();
        t.question();
    }
}
