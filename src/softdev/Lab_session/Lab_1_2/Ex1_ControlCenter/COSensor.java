package softdev.Lab_session.Lab_1_2.Ex1_ControlCenter;

public class COSensor extends Sensor {
    private float minConcentration;

    public COSensor(String type, String location, String manufacturer) {
        super(type, location, manufacturer);
    }

    public float getMinConcentration() {
        return minConcentration;
    }

    public void setMinConcentration(float minConcentration) {
        this.minConcentration = minConcentration;
    }

    @Override
    public void alarm() {
        System.out.println("Windows are being open and siren is sounding");
    }

    @Override
    public String toString() {
        String state= "inactive";
        if(activateState){
            state="active";
        }
        String str = "Info of " + state + " sensor (type = " + type + "), " +
                "from " + manufacturer + " located at " + location+
                " with a minimal CO concentration of " + minConcentration;
        return str;
    }
}

