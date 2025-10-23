import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class Draw extends JPanel {
    private Player player;
    private ArrayList<Alien> aliens;
    private ArrayList<Bullet> bullets;

    Image background = new ImageIcon("background.gif").getImage();
    Image alienImg = new ImageIcon("alien.png").getImage();
    Image bulletImg = new ImageIcon("bullet.png").getImage();
    Image playerImg = new ImageIcon("soldier.png").getImage();

    public Draw(Player player, ArrayList<Alien> aliens, ArrayList<Bullet> bullets) {
        this.player = player;
        this.aliens = aliens;
        this.bullets = bullets;
        setBackground(Color.BLACK);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background, 0, 0, 600, 600, this);
        g.drawImage(playerImg, player.getX(), player.getY(), this);

        for (Alien alien : aliens) {
            g.drawImage(alienImg, alien.getX(), alien.getY(), this);
        }

        for (Bullet bullet : bullets) {
            g.drawImage(bulletImg, bullet.getX(), bullet.getY(), this);
        }
    }
}
