
import javax.swing.*;

public class App{

    public static void main(String[] args) {
        int appWidth = 360;
        int appLength = 640;

        JFrame frame = new JFrame("Far & Beyond");
        frame.setSize(appWidth, appLength);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        
        Plane plane = new Plane();
        frame.add(plane);
        frame.pack();
        frame.setVisible(true);

    }
}