package palindrome;

/**
 * This program takes a word or phrase and checks to see if it is a palindrome
 * It will take the word or phrase and strip the non-alphabetic characters from
 * it, then reverse it, and then check to see if it is a palindrome.
 * 
 * This program will not detect blank entries or entries that become blank if no
 * alphabetic characters were entered.
 * 
 * @author aprogrammer
 */

import java.*;

public class PalinDrome {

       
    public static void main(String[] args) {
        // TODO code application logic here
        
        String wordIn = "";         // declare the entered word string variable
        String reverseWord = "";    // delcare the reveresed word string variable
        String wordOut = "";        // declare the word out (from stripping) variable
        
        // prompt the user for the word or phrase to check if palindrome
        TextIO.put("Please enter a word or phrase: ");
        wordIn = TextIO.getln();
        
        // let's see the original word
        TextIO.putln("Original word: " + wordIn);
        
        // assign the value from the return value of stripIt to wordOut
        wordOut = stripIt(wordIn);
        
        // assign the value from the return value of revereseIt to reverseWord
        reverseWord = reverseIt(wordOut);
        
        // execute the palindrome checker and send it wordOut and reverseWord
        checkIt(wordOut, reverseWord);
        
        int N=5;
        int D=4;
        int A=0;
        D = calcValue(A);
        System.out.println("D = " + D);
    }
    
    // This subroutine takes the original word and cleans out the non-alpha characters
    static String stripIt(String tempWord)
    {    
        // replace those pesky non alphas with nothings i.e. numbers and symbols are stripped
        tempWord = tempWord.replaceAll("[^a-zA-Z]", "");
        
        // drop what is left to lowercase
        tempWord = tempWord.toLowerCase();
        
        // shows us the word stripped of all non-alpha characters
        TextIO.putln("Stripped word: " + tempWord);
        
        // send the results back to the call
        return String.valueOf(tempWord);
    }
    
    // This subroutine takes the stripped word and reverses it
    static String reverseIt(String reverseTemp)
    {
        int i;
        String reverse = "";
        reverse = "";
        for (i=reverseTemp.length() - 1; i >= 0; i--)
        {
            reverse = reverse + reverseTemp.charAt(i);
        }
        TextIO.putln("Reverse word: " + reverse);
        return String.valueOf(reverse);
    }
    
    // This subroutine checks to see if the stripped and reverese words form a palindrome and tells us
    static void checkIt(String checkOut, String checkReverse)
    {
        if (checkOut.equals(checkReverse)){
            TextIO.putln("This IS a palindrome.");
        }
        else {
            TextIO.putln("This is NOT a palindrome");
            }
    }
    
    static int calcValue( int N) 
    {
    int D;
    for( D=0; D<5; D++) {
        N++;
    }
    return(N);
    }
    
    
}
