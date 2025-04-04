import java.awt.*; import javax.swing.*; // 20:33

public class Casinha extends JFrame {
    public Casinha() {
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true); }
    
    public void paint(Graphics g) {
        super.paint(g);
                
        g.drawRect(146, 89, 56, 89);
        g.drawRect(202, 87, 114, 90);
        g.drawLine(176, 44, 204, 89);
        g.drawLine(174, 45, 146, 88);
        g.drawLine(176, 47, 283, 49);
        g.drawLine(283, 49, 317, 88);
        g.drawRect(241, 118, 38, 25);
        g.drawRect(165, 130, 22, 48);
        g.drawOval(166, 99, 20, 19);
        g.drawOval(61, 41, 28, 26);
        g.drawLine(103, 27, 91, 40);
        g.drawLine(109, 63, 91, 67);
        g.drawLine(77, 75, 81, 100);
        g.drawLine(58, 76, 41, 86);
        g.drawLine(50, 60, 23, 53);
        g.drawLine(59, 37, 47, 16);
        g.drawLine(377, 132, 375, 133);
        g.drawLine(172, 18, 172, 43);
        g.drawLine(178, 29, 162, 30);        
    }
    public static void main(String [] args) { new Casinha(); }
}
