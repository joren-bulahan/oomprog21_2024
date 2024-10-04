class Circle {
    private double radius;
    private double diameter;
    private double area;

    public Circle() {
        radius = 1;
        diameter = 2 * radius;
        area = Math.PI * radius * radius;
    }

    public void setRadius(double rad) {
        radius = rad;
        diameter = 2 * radius;
        area = Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;
    }
}

public class Main {
    public static void main(String[] args) {
       
        Circle circle1 = new Circle();
        System.out.println("Circle 1:");
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Diameter: " + circle1.getDiameter());
        System.out.println("Area: " + circle1.getArea());

      
        Circle circle2 = new Circle();
        circle2.setRadius(5);
        System.out.println("\nCircle 2:");
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Diameter: " + circle2.getDiameter());
        System.out.println("Area: " + circle2.getArea());
    }
}
