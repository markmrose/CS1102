
package icecreamcones;

/**
 *
 * @author a programmer
 */
public class IceCreamCones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TextIO.readFile("C:/Users/aprogrammer/Documents/NetBeansProjects/IceCreamCones/src/icecreamcones/icecream.dat");
        int coneCount = 0; // initialize the amount of cones counted
        int strawCount = 0; // initialize the strawberry cones counter
        String word; // set up the string variable for the cone name

        while(TextIO.eof() == false) // read the file until the eof is reached
        {
            word = TextIO.getln(); // assign the information found in the line of text to word
            
            if (word.equals("Strawberry")) // check to see if the word found is equal to "Strawberry"
                strawCount++; // if equal then increment the counter for Strawberry
            coneCount++; // now increment the cones counted
        }   //end of while
        
        // print out what we found and do some math below
        TextIO.putln("Total Number of cones: " + coneCount);
        TextIO.putln("Total number of Strawberry cones: " + strawCount);
        double cones = coneCount;
        double straws = strawCount;
        double percent = (100*straws)/cones;
        TextIO.put("Percentage of Strawberry cones: ");
        TextIO.putln(String.format("%.1f%%", percent));
    }   //end of Main   
}   //end of IceCreamCones
