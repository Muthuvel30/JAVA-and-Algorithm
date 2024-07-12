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

class Main {
    public static void main(String[] args) {
        rectangle re = new rectangle();
        float t = re.getarea(90, 8);

        System.out.println(t);
    }
}
