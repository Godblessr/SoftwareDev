package softdev.Lab_session.Lab_1_2.Ex1_ControlCenter;

public class ControlCenterTest {
    @org.junit.jupiter.api.Test
    public void test1(){
        ControlCenter ctcenter = new ControlCenter("controle",Size.small);
        Sensor sensor1 = new Sensor("CO Sensor", "Kitchen", "Dovi");
        Sensor sensor2 = new Sensor("Smoke Sensor", "Kitchen", "Dovi");
        MotionSensor mtsensor = new MotionSensor("Motion Sensor", "Front Door","Bose", 2);
        MotionSensor mtsensor2 = new MotionSensor("Motion Sensor", "Front Door","Bose", 2);
        ctcenter.addSensor(sensor1);
        ctcenter.addSensor(sensor2);
        ctcenter.addSensor(mtsensor);
        ctcenter.addSensor(mtsensor2);
        ctcenter.overview();
        ctcenter.testAllSensors();
    }
}