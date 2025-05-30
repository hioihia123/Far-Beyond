/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PlaneGame;

/**
 *
 * @author nguyenp
 */

import java.awt.*;
import javax.swing.*;

public class Plane extends JPanel {
    int width = 360;
    int height = 640;
    
    //Images
    Image backgroundImg;
    Image planeImg;
    Image topPipeImg;
    
    

    Plane(){
        setPreferredSize(new Dimension(width, height));
        setBackground(Color.blue);
    }
}

