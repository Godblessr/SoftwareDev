package softdev.Lab_session.Lab_1_2.Ex1_ControlCenter;

public class MotionSensor extends Sensor {
    private float triggerdistance;

    public MotionSensor(String type, String location, String manufacturer, float triggerdistance) {
        super(type, location, manufacturer);
        this.triggerdistance = triggerdistance;
    }

    public void setTriggerdistance(float triggerdistance) {
        this.triggerdistance = triggerdistance;
    }

    public float getTriggerdistance() {
        return triggerdistance;
    }

    @Override
    public void alarm() {
        System.out.println("Police are being contacted and siren is sounding");
    }
    @Override
    public String toString() {
        String str = super.toString() + " with an active radius of " + triggerdistance + 'm';
        return str;
    }
}

