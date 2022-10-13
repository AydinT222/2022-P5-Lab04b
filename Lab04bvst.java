// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bvst extends Applet
{

    public void paint(Graphics g)
    {
        // DRAW CUBE
        g.drawRect(50, 50, 200, 200);
        g.drawLine(50, 50, 150, 150);
        g.drawLine(250, 50, 350, 150);
        g.drawLine(50, 250, 150, 350);
        g.drawLine(250, 250, 350, 350);

        // DRAW SPHERE (inside cube)
        final int sphere_offset_x = -650;
        final int sphere_offset_y = 50;
        final int sphere_size = 200;

        g.drawOval(750 + sphere_offset_x, 50 + sphere_offset_y, sphere_size, sphere_size);

        // Horizontal line segments
        g.drawOval(750 + sphere_offset_x, 100 + sphere_offset_y, sphere_size, sphere_size - 100);
        g.drawOval(750 + sphere_offset_x, 75 + sphere_offset_y, sphere_size, sphere_size - 50);
        g.drawOval(750 + sphere_offset_x, 125 + sphere_offset_y, sphere_size, sphere_size - 150);

        // Vertical line segments
        g.drawOval(775 + sphere_offset_x, 50 + sphere_offset_y, sphere_size - 50, sphere_size);
        g.drawOval(800 + sphere_offset_x, 50 + sphere_offset_y, sphere_size - 100, sphere_size);
        g.drawOval(825 + sphere_offset_x, 50 + sphere_offset_y, sphere_size - 150, sphere_size);

        // DRAW CUBE
        g.drawRect(150, 150, 200, 200);

        /*
        g.drawOval(750, 50, 200);

        // Horizontal Line Segments
        g.drawOval(750, 100, 200, 100);
        g.drawOval(750, 75, 200, 150);
        g.drawOval(750, 125, 200, 50);

        // Vertical Line Segments
        g.drawOval(775, 50, 150, 200);
        g.drawOval(800, 50, 100, 200);
        g.drawOval(825, 50, 50, 200);
        */

        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
        g.drawOval(750, 400, 225, 225);
        g.drawLine(750, 525, 925, 420);
        g.drawLine(750, 525, 875, 625);
        g.drawLine(875, 625, 925, 420);
        // im sorry for not using 50s, 75s, or 25s, it kept not looking right when doing that
        g.drawOval(790, 477, 107, 107);


        // DRAW APCS
        // A
        g.fillRect(50, 450, 25, 125);
        g.fillRect(100, 450, 25, 125);
        g.fillRect(75, 450, 25, 25);
        g.fillRect(75, 500, 25, 25);

        // P
        g.fillRect(150, 450, 25, 125);
        g.fillRect(175, 450, 50, 25);
        g.fillRect(175, 500, 50, 25);
        g.fillRect(200, 475, 25, 25);

        // C
        g.fillRect(250, 450, 25, 125);
        g.fillRect(275, 450, 50, 25);
        g.fillRect(275, 550, 50, 25);

        // S
        g.fillRect(350, 450, 25, 75);
        g.fillRect(375, 450, 50, 25);
        g.fillRect(375, 500, 50, 25);
        g.fillRect(400, 500, 25, 75);
        g.fillRect(350, 550, 50, 25);


        // DRAW PACMEN FLOWER (this was hard)
        g.fillArc(500, 350, 100, 100, 135,270);
        g.fillArc(500, 480, 100, 100, -45, 270);

        // again sorry for doing this
        g.fillArc(565, 415, 100, 100, 45, 270);
        g.fillArc(435, 415, 100, 100, 230, 270);


    }

}

