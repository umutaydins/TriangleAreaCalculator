import java.util.Scanner;

public class TriangleAreaCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the first side of the triangle: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the length of the second side of the triangle: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the length of the third side of the triangle: ");
        double c = scanner.nextDouble();

        scanner.close();
        // Calculate half of the perimeter
        double u = (a + b + c) / 2;

        // Calculate the area
        double area = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("The area of the triangle is: " + area);
    }
}
