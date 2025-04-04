import java.awt.*; 
import javax.swing.*; // 20:33

public class Tabuleiro extends JFrame {
    public Tabuleiro() {
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true); 
    }
    public void paint(Graphics g) {
        super.paint(g);
        for (int col = 1; col < 9; col += 1) {
            g.drawString(""+col, (50*col)+25, 35);
        }
        int a = 64;
        for (int col = 1; col < 9; col += 1) {
            g.drawString(""+(char)(a+col), 35, (50*col)+25);
        }
        for (int lin = 1; lin < 9; lin += 1) { 
            for (int col = 1; col < 9; col += 1) {
                g.setColor((lin+col) % 2 == 0?Color.WHITE:Color.BLACK);
                g.fillRect(50*lin, 50*col, 50, 50);
            }
        }
    }
    public static void main(String [] args) { 
        new Tabuleiro(); 
    }
}
