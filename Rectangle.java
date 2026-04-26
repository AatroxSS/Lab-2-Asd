import java.util.Random;

public class Rectangle {
    private double x1, y1;
    private double x2, y2;
    private double x3, y3;
    private double x4, y4;

    public Rectangle() {
        Random rand = new Random();
        boolean valid = false;

        while (!valid) {
            x1 = -100 + rand.nextDouble() * 200;
            y1 = -100 + rand.nextDouble() * 200;
            x2 = -100 + rand.nextDouble() * 200;
            y2 = -100 + rand.nextDouble() * 200;

            if (x1 < x2 && y1 > y2) {
                x3 = x1;
                y3 = y2;
                x4 = x2;
                y4 = y1;
                valid = true;
            }
        }
    }

    public Rectangle(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x1;
        this.y3 = y2;
        this.x4 = x2;
        this.y4 = y1;
    }

    public double getWidth() {
        return x2 - x1;
    }

    public double getHeight() {
        return y1 - y2;
    }

    public double getArea() {
        return getWidth() * getHeight();
    }

    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    public int getKey() {
        return (int) Math.round(getPerimeter());
    }

    public String toString() {
        return String.format("Прямокутник[(%.1f,%.1f)-(%.1f,%.1f)] | Ширина=%.2f | Висота=%.2f | Площа=%.2f | Периметр=%.2f",
                x1, y1, x2, y2, getWidth(), getHeight(), getArea(), getPerimeter());
    }
}
