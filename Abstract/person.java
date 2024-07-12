package Abstract;

abstract class Shape {
    public abstract double getarea();
}

class rectangle extends Shape {
    private double length;
    private double width;

    public rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getarea() {
        return length * width;
    }
}

class person {
    public static void main(String[] args) {
        rectangle r = new rectangle(4, 5);
        System.out.println(r.getarea());
    }
}
