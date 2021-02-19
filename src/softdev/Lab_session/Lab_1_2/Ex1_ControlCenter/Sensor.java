package softdev.Lab_session.Lab_1_2.Ex1_ControlCenter;

public class Sensor {
    private String type;
    private String location;
    private String manufacturer;
    private boolean activateState = false;

    public Sensor(String type, String location, String manufacturer) {
        this.type = type;
        this.location = location;
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean getActivateState() {
        return activateState;
    }

    public void setActivateState(boolean activateState) {
        this.activateState = activateState;
    }

    public void alarm() {
        System.out.println("Alarm in" + type + "sensor" + location + "(" + manufacturer + ")");
    }


}

