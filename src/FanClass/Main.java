package FanClass;

public class Main {
    public static void main(String[] args) {
        FanClass fan1 = new FanClass();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setIsOn(true);
        System.out.println("Fan 1 --> " + fan1.toString());

        FanClass fan2 = new FanClass();
        fan2.setSpeed(fan1.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.setIsOn(false);

        System.out.println("Fan 2 --> " + fan2.toString());
    }
}
