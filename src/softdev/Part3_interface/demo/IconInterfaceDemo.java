package softdev.Part3_interface.demo;

import javax.swing.*;

public class IconInterfaceDemo {

    public static void main(String[] args) {
//       JOptionPane.showMessageDialog(null,
//                "Hello World!",
//                "Message", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null,
//                "Hello World!",
//                "Message", JOptionPane.INFORMATION_MESSAGE,
//                new ImageIcon("globe.gif"));
//        JOptionPane.showMessageDialog(null,
//                "Hello from Mars!",
//                "Message", JOptionPane.INFORMATION_MESSAGE,
//                new MarsIcon(50));
       JOptionPane.showMessageDialog(null,
               "Hello from me!", "Message",
               JOptionPane.INFORMATION_MESSAGE, new MyIcon2());

//        Icon myIcon = new EarthIcon();
//        System.out.println(myIcon.getIconHeight());
//        myIcon = new MarsIcon(100);
//        ((EarthIcon)myIcon).blablabla();
//        JOptionPane.showMessageDialog(null, "Hello from Mars!", "Message", JOptionPane.INFORMATION_MESSAGE, myIcon);
    }
}
