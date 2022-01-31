package OrbitalCalculator;
import javax.swing.JFrame;
public class orbitalFrame extends JFrame{
    orbitalFrame(){
        this.add(new orbitalMonitor());
        this.setTitle("Orbital Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
    }
}
