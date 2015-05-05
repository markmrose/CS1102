package diceroll;

// DiceRoll class
// Written for Java 1.8
// Revision date: 4/21/15

// By: A. Programmer

/*------------------------------------------------------------------------------
  This program will roll 2 dice 1000 times and return the quantity
  of mean rolls taken to get snake eyes - two single pips.
  Based upon probability, the value should be around 36 rolls.

  No user input required.
  ------------------------------------------------------------------------------
*/

public class DiceRoll
{
    static int numOfRolls=1000;  // How many rolls to simulate
    public static void main(String[] args)
    {
        // How many times is snake eyes rolled over 1000 rolls
        //  Pips are the dots on the dice.
        double meanRolls;
        int numPips=2; // this is the snake eyes pip count
        meanRolls=rollCountAve(numPips);  // Main call to functions
        System.out.println("This program will roll a pair of dice 1,000 times");
        System.out.println("and calculate the average number of times that the dice");
        System.out.println("show snake eyes or one pip on each die.");
        System.out.println("");
        System.out.print("From 1000 rolls, the mean number of rolls for snake eyes is: ");
        System.out.println(meanRolls);
		// if using TexIO.java the above System.out.xxxx lines would be as such:
		// TextIO.putln("This program will roll a pair of dice 1,000 times");
        // TextIO.putln("and calculate the average number of times that the dice");
        // TextIO.putln("show snake eyes or one pip on each die.");
        // TextIO.putln("");
        // TextIO.put("From 1000 rolls, the mean number of rolls for snake eyes is: ");
        // TextIO.putln(meanRolls);
    }   // end of main()
   
    static double rollCountAve(int rolls)
    {
        int rollCount;  // declare the variable to hold the roll counter
        int rollTotal;  // declare the number of rolls
        double meanRoll;  // declare the mean variable
        rollTotal = 0;
        
        for (int i = 0; i<numOfRolls; i++)
        {
            rollCount=rollDiceNow(rolls);
            rollTotal+=rollCount;
        }
        
        meanRoll=((double)rollTotal)/numOfRolls;
        return meanRoll;
    }   //end of rollCountAve()
    
    static int rollDiceNow(int pip)
    {
        int die1,die2;  // Initiliaze the pips variable
        int roll;        // Initilialize total pips
        int countRolls;      // declare the obvious
        countRolls = 0;
        
        do
        {
            die1=(int)(Math.random()*6)+1;
            die2=(int)(Math.random()*6)+1;
            roll=die1+die2;
            countRolls++;
        }
        while (die1!=1||die2!=1);
        
        return countRolls;
    }   // end of rollDiceNow
}   // end of DiceRoll