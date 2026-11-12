package maaven.maaven;

public class Triangle {

    /**
     * Calculates the area of a triangle given its base and height.
     * Formula: 0.5 * base * height
     * 
     * @param base   Length of the triangle base (must be positive)
     * @param height Height of the triangle (must be positive)
     * @return Calculated area as a double
     * @throws IllegalArgumentException if base or height is less than or equal to zero
     */
    public static double calculateArea(double base, double height) {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Base and height must be positive values.");
        }
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        double base = 10.0;
        double height = 5.0;
        double area = calculateArea(base, height);

        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        System.out.println("Area of Triangle: " + area);
    }
}