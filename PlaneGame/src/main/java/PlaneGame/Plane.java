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
import javax.swing.ImageIcon;
import java.awt.Image;
import java.net.URL;



public class Plane extends JPanel {
    int width = 360;
    int height = 640;
    
    //Images
    Image backgroundImg;
    Image planeImg;
    Image topPipeImg;
    Image bottomPipeImg;
    

    Plane(){
        setPreferredSize(new Dimension(width, height));
        
        URL bgURL = getClass().getResource("/PlaneGame/resources/backgroundImage.png");
        URL planeURL = getClass().getResource("/PlaneGame/resources/plane.png");
        URL topURL = getClass().getResource("/PlaneGame/resources/ruler.png");
        URL bottomURL = getClass().getResource("/PlaneGame/resources/bottomRuler.png");

if (bgURL == null || planeURL == null || topURL == null || bottomURL == null) {
    System.err.println("Error: One or more image paths are incorrect.");
    System.exit(1);
}

backgroundImg = new ImageIcon(bgURL).getImage();
planeImg = new ImageIcon(planeURL).getImage();
topPipeImg = new ImageIcon(topURL).getImage();
bottomPipeImg = new ImageIcon(bottomURL).getImage();

        
    }
    
    public void paintComponent(Graphics g){
        //super refers to the jpanel
        super.paintComponent(g);
        
        draw(g);
        
    }
    
    public void draw(Graphics g){
        //background
        g.drawImage(backgroundImg, 0,0,width, height, null);
    }
}

