import java.awt.*; import javax.swing.*; // 20:33

public class Base extends JFrame {
    public Base() {
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true); }
    public void paint(Graphics g) {
        super.paint(g);
        g.drawLine(100,100,200,200); // p1E, p1T, p2E, p2T
        g.drawRect(100,100,100,100); // pE, pT, L, A
        g.setColor(new Color(0xFF, 0, 0));
        g.fillOval(100,100,100,100); // pE, pT, L, A 
        g.drawString("Ola Mundo", 100, 300);
    }
    public static void main(String [] args) { new Base(); }
}
