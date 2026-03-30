import graphics.*;
import java.util.Scanner;

public class TestGraphics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Rectangle");
            System.out.println("2. Triangle");
            System.out.println("3. Square");
            System.out.println("4. Circle");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter length and breadth: ");
                    double l = sc.nextDouble();
                    double b = sc.nextDouble();
                    RectangleI r = new Rectangle(l, b);
                    System.out.println("Area: " + r.area());
                    System.out.println("Perimeter: " + r.perimeter());
                    break;

                case 2:
                    System.out.print("Enter 3 sides: ");
                    double a = sc.nextDouble();
                    double b1 = sc.nextDouble();
                    double c = sc.nextDouble();
                    System.out.print("Enter base and height: ");
                    double base = sc.nextDouble();
                    double height = sc.nextDouble();
                    TriangleI t = new Triangle(a, b1, c, base, height);
                    System.out.println("Area: " + t.area());
                    System.out.println("Perimeter: " + t.perimeter());
                    break;

                case 3:
                    System.out.print("Enter side: ");
                    double s = sc.nextDouble();
                    SquareI sq = new Square(s);
                    System.out.println("Area: " + sq.area());
                    System.out.println("Perimeter: " + sq.perimeter());
                    break;

                case 4:
                    System.out.print("Enter radius: ");
                    double r1 = sc.nextDouble();
                    CircleI cir = new Circle(r1);
                    System.out.println("Area: " + cir.area());
                    System.out.println("Perimeter: " + cir.perimeter());
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
