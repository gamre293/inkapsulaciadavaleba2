public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private Double x1;
    private Double x2;

    public QuadraticEquation(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("Coefficient 'a' cannot be zero for a quadratic equation.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        solveEquation();
    }

    private void solveEquation() {
        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            x1 = null;
            x2 = null;
        } else if (discriminant == 0) {
            x1 = -b / (2 * a);
            x2 = x1;
        } else {
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        QuadraticEquation other = (QuadraticEquation) obj;

        if (x1 == null && other.x1 == null && x2 == null && other.x2 == null) {
            return true;
        }

        return ((x1 != null && x1.equals(other.x1) && x2 != null && x2.equals(other.x2)) ||
                (x1 != null && x1.equals(other.x2) && x2 != null && x2.equals(other.x1)));
    }

    @Override
    public int hashCode() {
        return (x1 == null ? 0 : x1.hashCode()) + (x2 == null ? 0 : x2.hashCode());
    }

    @Override
    public String toString() {
        return "QuadraticEquation{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", x1=" + (x1 != null ? x1 : "No Real Solution") +
                ", x2=" + (x2 != null ? x2 : "No Real Solution") +
                '}';
    }
}
