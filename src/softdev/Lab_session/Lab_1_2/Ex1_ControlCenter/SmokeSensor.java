package softdev.Lab_session.Lab_1_2.Ex1_ControlCenter;

public class SmokeSensor extends Sensor {
    private final float minConcentration;

    public SmokeSensor(String type, String location, String manufacturer, float minConcentration) {
        super(type,location,manufacturer);
        this.minConcentration = minConcentration;
    }

    @Override
    public void alarm(){
        System.out.println("Windows are being closed and siren is sounding");
    }

    @Override
    public String toString() {
        return "SmokeSensor{" +
                "minConcentration=" + minConcentration +
                '}';
    }
}

