package Inheritence;

class shape {
    public float getarea(int len, int arr) {
        return len * arr;
    }

}

class rectangle extends shape {
    public float getarea(int len, int arr) {
        System.out.println(super.getarea(20, 43));
        return len * arr;

    }
}

class box extends rectangle {
    int hei;

    box() {

    }

    box(int hei) {
        this.hei = hei;
    }

    public float getarea(int len, int arr) {
        float re = super.getarea(len, arr);
        return re * hei;

    }
}

class Main {
    public static void main(String[] args) {
        shape sh = new shape();
        rectangle re = new rectangle();
        box b = new box(3);
        System.out.println(sh.getarea(34, 54));
        System.out.println(re.getarea(3, 4));
        System.out.println(b.getarea(5, 6));
    }
}
