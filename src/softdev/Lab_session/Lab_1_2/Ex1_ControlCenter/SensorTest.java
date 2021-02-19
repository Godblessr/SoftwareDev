package softdev.Lab_session.Lab_1_2.Ex1_ControlCenter;

import static org.junit.jupiter.api.Assertions.*;

public class SensorTest {

    @org.junit.jupiter.api.Test
    public void test1(){
       Sensor sensor = new Sensor("CO Sensor", "Kitchen", "Dovi");
       String str = "Info of inactive sensor (type = CO Sensor), " +
               "from Dovi located at Kitchen";
        assertTrue(str.equals(sensor.toString()));
    }

    @org.junit.jupiter.api.Test
    public void test2(){
        MotionSensor mtsensor = new MotionSensor("Motion Sensor", "Front Door","Bose", 2);
        mtsensor.setActivate();
        String str = "Info of active sensor (type = Motion Sensor), " +
                "from Bose located at Front Door with an active radius of 2.0m";
        assertEquals(str, mtsensor.toString());
    }
}