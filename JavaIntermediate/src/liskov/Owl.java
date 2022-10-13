package liskov;

public class Owl extends FlyingBird {
    private int altitude;

    public void fly() {
        this.setAltitude(this.getAltitude() + 1000);
        System.out.println("This bird can fly at altitude of "+altitude);
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }
}