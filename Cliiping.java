package komgraf_pert8; 

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class komgraf_pert10 extends JPanel { 
    public komgraf_pert10 (){
        this.setPreferredSize(new Dimension(700,500)); 
        this.setBackground(Color.white);
        
       
    }
   
    @Override
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      Graphics2D g2 = (Graphics2D)g;
      
 try
      {
          BufferedImage img = ImageIO.read(new File("C:\\Users\\user\\Documents\\komgraf\\us.jpg")); 
      
          Shape lingkaran = new Ellipse2D.Double(30, 30, 250, 250); 
          g2.clip(lingkaran); 
          
          g2.drawImage(img, 10, 10, 400, 300, null); 
          g2.setClip(null); //Membatalkan pembatasan area gambar 
          g2.drawString("Clipping: Sunset",100,350); 
          
          g2.drawImage(img, 300, 10, 400, 300, null);
          g2.drawString("Gambar asli: Sunset",400,350); 
          
      }
        catch(IOException e)
            
        {
        }
    }
}