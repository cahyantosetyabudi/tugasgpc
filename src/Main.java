import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Garis garis = new Garis();
        g.setColor(Color.BLACK);
        garis.Garisku(g, 120, 100, 170, 140);
    }

    public static void main(String[] args) {
        Garis garis = new Garis();
        JFrame frame = new JFrame("Gambar Garis");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Main());
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // TODO code application lingkaran logic here
        JFrame frame1 = new JFrame("Lingkaran");
        Lingkaran panel = new Lingkaran(120,100,64);
        frame1.add(panel);
        frame1.pack();
        frame1.setVisible(true);
        frame1.setResizable(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
