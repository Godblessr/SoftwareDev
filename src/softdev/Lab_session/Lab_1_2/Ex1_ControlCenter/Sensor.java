package softdev.Lab_session.Lab_1_2.Ex1_ControlCenter;

public class Sensor {
    protected String type;
    protected String location;
    protected String manufacturer;
    protected boolean activateState = false;

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

    public void setActivate() {
        activateState = true;
    }

    public void alarm() {
        System.out.println("Alarm in" + type + "sensor" + location + "(" +
                manufacturer + ")");
    }

    @Override
    public String toString() {
        String state= "inactive";
        if(activateState){
            state="active";
        }
        String str = "Info of " + state + " sensor (type = " + type + "), " +
                "from " + manufacturer + " located at " + location;
        return str;
    }
}

