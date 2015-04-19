// GravityCalculator class
// Written for Java 1.8
// Revision date: 4/11/15

// By: A. Programmer

/*------------------------------------------------------------------------------
  This class calculates the position of an object dropped from the height of 
  1000 meters, after 10 seconds of frictionless freefall, and worked upon by
  the acceleration of gravity at sea level (9.81_m/s2).
  
  The function for this class is: x(t) = 0.5*a*t^2 + vi*t + xi

  Variable declarations are below

  No user input required.
  ------------------------------------------------------------------------------
*/

import java.io.*;
enum Season { SPRING, SUMMER, FALL, WINTER } ;

public class GravityCalculator {
    public static void main(String[] arguments){
        
        // declaring the variables for the class
        
        double gravity =-9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0; // starting velocity of the object
        double fallingTime = 10.0; // time in seconds that the object falls
        double initialPosition = 1000.0; // Starting position in meters, the calculation will determine the ending position in meters
        double finalPosition = 0.0;
        
        /* Now calculate the position of the object falling using the function
           wherein the formula variables are associated as follows:
           
           Variable   Meaning                  Value     Declaration
           a          Acceleration (m/s2)      -9.81     gravity
           t          Time (s)                 10        fallingTime
           vi         Initial velocity (m/s)   0         initialVelocity
           xi         Initial position         1000      initialPosition
        */

        finalPosition = 0.5*gravity*fallingTime*fallingTime+initialVelocity*fallingTime+initialPosition;

        //System.out.println("The object's position after " + fallingTime +" seconds is "+finalPosition + " m.");
        System.out.print("The object's position after " + fallingTime +" seconds is ");
        System.out.format("%.1f", finalPosition); // Getting the output formatted to 1 decimal place
        System.out.println(" m."); // appending the units to the end of the output string
        
        Season vacation;
        vacation = Season.SUMMER;
        System.out.println(Season.SUMMER);
    } // end of main()
    
}  // end of class GravityCalculator