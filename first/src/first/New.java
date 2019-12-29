package first;

import java.util.Scanner;
import java.awt.BorderLayout;
import java.util.Hashtable;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JSlider;
import com.fazecast.jSerialComm.*;
 
public class New {
 
        public static void main(String[] args) {
                // create a window with a slider
                JFrame window = new JFrame("Plant Monitoring System");
                JSlider slider = new JSlider();
                slider.setPaintLabels(true);
                slider.setMaximum(1023);
       
                table.put (10, new JLabel("ENOUGH WATER,I AM FULL(0 BAR)"));
                table.put (950, new JLabel("NEED WATER, WHAT THE HELL MAN?(1000 BAR)"));
                table.put (512, new JLabel("OPT
                window.add(slider);
                window.pack();
                Hashtable<Integer, JLabel> table = new Hashtable<Integer, JLabel>();
                IMUM WATER LEVEL,EQULIBRIUM(500 BAR) "));


                slider.setLabelTable (table);
                
                window.add(slider, BorderLayout.NORTH);
                window.setSize(1000, 500);
                window.setVisible(true);
                //window.setVisible(true);
               
                // determine which serial port to use
                SerialPort ports[] = SerialPort.getCommPorts();
                System.out.println("Select a port:");
                int i = 1;
                for(SerialPort port : ports) {
                        System.out.println(i++ + ". " + port.getSystemPortName());
                }
                Scanner s = new Scanner(System.in);
                int chosenPort = s.nextInt();

                // open and configure the port
                SerialPort port = ports[chosenPort - 1];
                if(port.openPort()) {
                        System.out.println("Successfully opened the port.");
                } else {
                        System.out.println("Unable to open the port.");
                        return;
                }
                port.setComPortTimeouts(SerialPort.TIMEOUT_READ_SEMI_BLOCKING, 0, 0);
               
                // enter into an infinite loop that reads from the port and updates the GUI
                Scanner data = new Scanner(port.getInputStream());
                while(data.hasNextLine()) {
                        int number = 0;
                        try{number = Integer.parseInt(data.nextLine());}catch(Exception e){}
                        slider.setValue(number);
                        if(number<500)
                        {
                        		System.out.println("happy plant");
                        
                        }
                        else
                        {
                        	System.out.println("Thristy plant");
                        }
        }

}
}