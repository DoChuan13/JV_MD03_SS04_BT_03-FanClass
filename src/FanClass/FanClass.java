package FanClass;

public class FanClass {
    public final int SLOW = 1;
    public final int MEDIUM = 2;
    public final int FAST = 3;

    private int speed = this.SLOW;
    private double radius = 5;
    private String color = "blue";

    private boolean isOn = false;

    public FanClass() {
    }

    public int getSpeed() {
        return speed;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setIsOn(boolean status) {
        this.isOn = status;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "FanClass{" +
                "speed=" + speed +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                ", isOn=" + isOn +
                '}';
    }
}
