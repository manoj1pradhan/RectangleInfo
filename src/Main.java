import java.util.Scanner;

class RectangleInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char calculateAgain;

        do {
            double width, height;

            do {
                System.out.print("Enter the width of the rectangle: ");
                width = scanner.nextDouble();
                if (width <= 0) {
                    System.out.println("Width must be greater than zero.");
                }
            } while (width <= 0);

            do {
                System.out.print("Enter the height of the rectangle: ");
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be greater than zero.");
                }
            } while (height <= 0);

            double area = width * height;

            double perimeter = 2 * (width + height);

            double diagonal = Math.sqrt(width * width + height * height);

            System.out.printf("Area of the rectangle: %.2f square units%n", area);
            System.out.printf("Perimeter of the rectangle: %.2f units%n", perimeter);
            System.out.printf("Length of the diagonal: %.2f units%n", diagonal);

            System.out.print("Calculate again? (Y/N): ");
            calculateAgain = scanner.next().charAt(0);
        } while (calculateAgain == 'Y' || calculateAgain == 'y');

        System.out.println("Thanks for using the Rectangle Calculator!");
        scanner.close();
    }
}
