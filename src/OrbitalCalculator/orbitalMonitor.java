package OrbitalCalculator;
import javax.swing.*;
import java.awt.*;

// This is much better than regular vim... with the exception of performance.
public class orbitalMonitor extends JPanel {
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 10;
    static final double GRAVITATIONAL_CONST = 6.67e-11;
    orbitalMonitor(){ //This contains all of our panel objects.
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
    }


}
