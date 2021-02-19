package softdev.Lab_session.Lab_1_2.Ex1_ControlCenter;

import java.util.ArrayList;

public class ControlCenter {
    private String name;
    private ArrayList<Sensor> SensorList;
    private Size size;

    public ControlCenter(String name, Size size) {
        this.name = name;
        SensorList = new ArrayList<Sensor>();
        this.size = size;
    }

    public void addSensor(Sensor S) {
        boolean flag = false;
        for (Sensor s : SensorList) {
            if (s.getType().equals(S.getType()) && s.getLocation().equals(S.getLocation())
                    && s.getManufacturer().equals(S.getManufacturer())) {
                flag = true;
            }
        }
        if (flag==false) {
            SensorList.add(S);
        }

    }

    public int testAllSensors() {
        int num = 0;
        for (Sensor s : SensorList) {
            if (s.getActivateState()) {
                    num++;
                    s.alarm();
                }
            }
        System.out.println("Number of active senses: "+num);
            return num;
    }

    public int testSensor(Sensor s) {
        int index = 0;
        for (Sensor a : SensorList) {
            if (s.getType().equals(a.getType()) && s.getLocation().equals(a.getLocation())
                    && s.getManufacturer().equals(a.getManufacturer())) {
                s.alarm();
                return index;
            } else {
                index++;
            }
        }
        return -1;
    }

    public void overview() {
        System.out.println("Overview of all sensors @ Campus Groep T (" + size + ")");
        for (Sensor s: SensorList){
                System.out.println(s.toString());
            }
        }

}
