/* Title: Satellite Velocity Calculator
 * Author: Alessandro Lou 
 * Date: 1/20/2019
 * Book: An Introduction to Object-Oriented Programming with Java (5th Addition)
 * Exercise: Chapter Three, Level 2 Programming Exercise
 */


package Chapter3;

public class exercise15 {
    // Symbolic constants for MASS_OF_EARTH and FORCE_OF_GRAVITY
    public static final double MASS_OF_EARTH = 5.98 * Math.pow(10, 24);
    public static final double FORCE_OF_GRAVITY = 6.67 * Math.pow(10, -11);

    public static void main(String[] args) {
        double hubbleSpaceTelescope = 6.98 * Math.pow(10, 6);
        double dummySpaceTelescope = 4 * Math.pow(10, 5);

        System.out.println("The distance from the center of the Earth and the Hubble Space Telescope is "
                + (int) hubbleSpaceTelescope + " meters.");
        System.out.println("The distance from the center of the Earth and the Dummy Telescope is "
                + (int) dummySpaceTelescope + " meters.");
        System.out.println("The velocity of the Hubble Space Telescope is approximately "
                + Math.round(satelliteVelocity(hubbleSpaceTelescope)) + " meters/second.");
        System.out.println("The velocity of the Dummy Space Telscope is approximately "
                + Math.round(satelliteVelocity(dummySpaceTelescope)) + " meters/second.");

        if (satelliteVelocity(dummySpaceTelescope) > satelliteVelocity(hubbleSpaceTelescope)) {
            System.out.println(
                    "This confirms the hypothesis that a satellite that is closer to Earth travels faster than a satellite that is farther from Earth!");
        } else {
            System.out.println("The hypothesis was incorrect");
        }
    }

    // Method that calculates the satellite velocity with the argument passed into
    // the parameter being the distance
    // of the satellite from the center of the earth. This method returns the
    // satellite velocity.
    public static double satelliteVelocity(double radius) {
        double velocity = Math.sqrt((FORCE_OF_GRAVITY * MASS_OF_EARTH) / radius);
        return velocity;
    }
}
