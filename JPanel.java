package komgraf_pert8;

import javax.swing.JFrame;

public class pert8 {

   
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Komgraf");
        frame.setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);
        
        komgraf_pert10 panel = new komgraf_pert10();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        
    }
    
}
