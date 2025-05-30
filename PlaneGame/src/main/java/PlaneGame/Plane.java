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
import java.net.MalformedURLException;




public class Plane extends JPanel {
    int width = 360;
    int height = 640;
    
    //Images
    Image backgroundImg;
    Image planeImg;
    Image topPipeImg;
    Image bottomPipeImg;
    
    //Plane info
    int planeX = width/8;
    int planeY = height/2;
    
    int planeWidth = 54;
    int planeHeight = 44;
    
    class PlaneInstance{
        int x = planeX;
        int y = planeY;
        
        int width = planeWidth;
        int height = planeHeight;
        Image img;
        
        PlaneInstance(Image img){
            this.img = img;
        }
    }
    
    PlaneInstance newPlane;
    
    Plane(){
        setPreferredSize(new Dimension(width, height));
        
        try {
            URL backgroundURL = new URL("https://raw.githubusercontent.com/hioihia123/Far-Beyond/refs/heads/main/src/classroom_with_desks_resized.png");
            URL planeURL = new URL("https://raw.githubusercontent.com/hioihia123/Far-Beyond/refs/heads/main/src/paper_plane_pixel_style.png");
            URL topPipeURL = new URL("https://raw.githubusercontent.com/hioihia123/Far-Beyond/refs/heads/main/src/resized_ruler_pipe.png");
            URL bottomPipeURL = new URL("https://raw.githubusercontent.com/hioihia123/Far-Beyond/refs/heads/main/src/resized_ruler_pipe.png");
            
            backgroundImg = new ImageIcon(backgroundURL).getImage();
            planeImg = new ImageIcon(planeURL).getImage();
            topPipeImg = new ImageIcon(topPipeURL).getImage();
            bottomPipeImg = new ImageIcon(bottomPipeURL).getImage();
            
        } catch (MalformedURLException e) {
             e.printStackTrace();
        }
         newPlane = new PlaneInstance(planeImg);

        
    }
    
    public void paintComponent(Graphics g){
        //super refers to the jpanel
        super.paintComponent(g);
        
        draw(g);
        
    }
    
    public void draw(Graphics g){
        //background
        g.drawImage(backgroundImg, 0,0,width, height, null);
        
        //Plane
        g.drawImage(newPlane.img, newPlane.x, newPlane.y, newPlane.width, newPlane.height, null);
        
    }
}

