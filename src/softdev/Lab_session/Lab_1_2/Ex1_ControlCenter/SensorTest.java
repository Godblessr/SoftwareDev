package softdev.Lab_session.Lab_1_2.Ex1_ControlCenter;

import static org.junit.jupiter.api.Assertions.*;

public class SensorTest {

    @org.junit.jupiter.api.Test
    public void test1(){
       Sensor sensor = new Sensor("COSensor", "Kitchen", "Dovi");
       String str = "Info of inactive sensor (type = COSensor), from Dovi located at Kitchen";
        assertTrue(str.equals(sensor.toString()));;
    }

    @org.junit.jupiter.api.Test
    public void test2(){
        MotionSensor mtsensor = new MotionSensor("MotionSensor", "Front Door","Bose", 2);
        mtsensor.setActivate();
        String str = "Info of active sensor (type = MotionSensor), from Bose located at Front Door with an active radius of 2.0m";
        assertEquals(str, mtsensor.toString());
    }
}