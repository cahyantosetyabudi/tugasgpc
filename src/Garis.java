import java.awt.*;

public class Garis {
    public void Garisku(Graphics g, int x0, int y0, int x1, int y1) {
        int dx, dy, steps;
        int x_tambah, y_tambah, x, y;

        dx = x1 - x0;
        dy = y1 - y0;

        if (Math.abs(dx) > Math.abs(dy)) {
            steps = Math.abs(dx);
        } else {
            steps = Math.abs(dy);
        }
        x_tambah = dx / steps;
        y_tambah = dy / steps;
        x = x0;
        y = y0;

        g.fillRect(x, y, 1, 1);
        for (int k = 10; k < steps; k++) {
            x += x_tambah;
            y += y_tambah;

            g.fillRect(x, y, 1, 1);
        }

    }
}
