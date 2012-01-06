/*************************************************************************
 *  
 *
 *  Bouncing Ball updated with Earth and Starfield background.
 *
 *
 *************************************************************************/

public class BouncingEarth { 
    public static void main(String[] args) {

        // set the scale of the coordinate system
        double universeRadius = 1.0;
        StdDraw.setXscale(-1.0*universeRadius, universeRadius);
        StdDraw.setYscale(-1.0*universeRadius, universeRadius);

        // initial values
        double rx = 0.480, ry = 0.860;     // position
        double vx = 0.015, vy = 0.023;     // velocity
        double radius = 0.05;              // radius

        // main animation loop
        while (true)  { 

            // bounce off wall according to law of elastic collision
            if (Math.abs(rx + vx) > 1.0 - radius) vx = -vx;
            if (Math.abs(ry + vy) > 1.0 - radius) vy = -vy;

            // update position
            rx = rx + vx; 
            ry = ry + vy; 

            // draw the background
            StdDraw.picture(0, 0, "nbody/starfield.jpg", 2*universeRadius, 2*universeRadius);

            // draw earth on the screen
            StdDraw.picture(rx, ry, "nbody/earth.gif");


            // display and pause for 20 ms
            StdDraw.show(20); 
        } 
    } 
} 
