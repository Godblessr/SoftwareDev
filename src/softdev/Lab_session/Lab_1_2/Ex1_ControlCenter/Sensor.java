package softdev.Lab_session.Lab_1_2.Ex1_ControlCenter;

public class Sensor {
    private final String type;
    private final String location;
    private final String manufacturer;
    private boolean activateState = false;

    public Sensor(String type, String location, String manufacturer) {
        this.type = type;
        this.location = location;
        this.manufacturer = manufacturer;
    }

    public String getLocation() {
        return location;
    }

    public void setActivateState(boolean activateState) {
        this.activateState = activateState;
    }
}

