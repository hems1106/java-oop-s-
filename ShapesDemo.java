abstract class Shapes {
    int dim1, dim2;

    Shapes(int a, int b) {
        dim1 = a;
        dim2 = b;
    }

    abstract void printArea();
}

class Rectangle extends Shapes {
    Rectangle(int a, int b) { super(a, b); }

    @Override
    void printArea() {
        int area = dim1 * dim2;
        System.out.println("Area of Rectangle = " + area);
    }
}


class Triangle extends Shapes {
    Triangle(int a, int b) { super(a, b); }

    @Override
    void printArea() {
        double area = 0.5 * dim1 * dim2;
        System.out.println("Area of Triangle = " + area);
    }
}


class Circle extends Shapes {
    Circle(int r) { super(r, 0); }

    @Override
    void printArea() {
        double area = Math.PI * dim1 * dim1;
        System.out.println("Area of Circle = " + area);
    }
}


public class ShapesDemo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 20);
        r.printArea();

        Triangle t = new Triangle(10, 15);
        t.printArea();

        Circle c = new Circle(7);
        c.printArea();
    }
}



