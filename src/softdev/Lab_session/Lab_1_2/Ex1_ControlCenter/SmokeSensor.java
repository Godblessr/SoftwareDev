package softdev.Lab_session.Lab_1_2.Ex1_ControlCenter;

public class SmokeSensor extends Sensor {
    private boolean smokeOnly;

    public SmokeSensor(String type, String location, String manufacturer, boolean smokeOnly) {
        super(type, location, manufacturer);
        this.smokeOnly = smokeOnly;
    }

    public boolean getSmokeOnly() {
        return smokeOnly;
    }

    public void setSmokeOnly(boolean smokeOnly) {
        this.smokeOnly = smokeOnly;
    }

    @Override
    public void alarm() {
        System.out.println("Windows are being closed and siren is sounding");
    }

    @Override
    public String toString() {
        String state= "inactive";
        if(activateState){
            state="active";
        }
        String str = "Info of " + state + " sensor (type = " + type + "), " +
                "from " + manufacturer + " located at " + location+
         " smokeOnly" + "=" + String.valueOf(smokeOnly);
        return str;
    }
}

