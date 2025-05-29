
import java.awt.*;
import javax.swing.*;

public class Plane extends JPanel {
    int width = 360;
    int height = 640;

    Plane(){
        setPreferredSize(new Dimension(width, height));
        setBackground(Color.blue);
    }
}
