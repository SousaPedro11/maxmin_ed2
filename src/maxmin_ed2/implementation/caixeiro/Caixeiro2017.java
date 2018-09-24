package maxmin_ed2.implementation.caixeiro;

import javax.swing.JFrame;

public class Caixeiro2017 {

    public static void main(String[] args) {
       Pontos p = new Pontos(4,640,480);
       JFrame pto = new JFrame("Pontos Gerados");
       pto.add(p);
       pto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       pto.setSize(640,480);
       pto.setVisible(true);
    }
    
}