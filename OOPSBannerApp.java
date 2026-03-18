/**
* 00PSBannerApp UC6 - 00PS Banner Application (Use Case 6)
* This use case extends UC5 by implementing a modular approach to generate each
* letter's pattern through dedicated methods. This enhances code reusability and
* maintainability by separating pattern generation logic from the main display logic.
*
* @author Developer
* @version 6.0
*/

public class OOPSBannerApp {

    // Method to generate the pattern for the letter 'O' (7x9)
    public static String[] getOPattern() {
        return new String[] {
            "  *****  ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "  *****  "
        };
    }

    // Method to generate the pattern for the letter 'P' (7x9)
    public static String[] getPPattern() {
        return new String[] {
            "*********",
            "**     **",
            "**     **",
            "*********",
            "**       ",
            "**       ",
            "**       "
        };
    }

    // Method to generate the pattern for the letter 'S' (7x9)
    public static String[] getSPattern() {
        return new String[] {
            " ********",
            "**       ",
            "**       ",
            " ********",
            "       **",
            "       **",
            "******** "
        };
    }

    // Main method to run the banner display
    public static void main(String[] args) {
        
        // Declare String Arrays to hold patterns for each letter
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Use the loop to Assemble each line of the banner to create the 
        // visual effect for the message "OOPS"
        for (int i = 0; i < oPattern.length; i++) {
            // Memory efficient assembly using String.join
            // Order: O, O, P, S
            String line = String.join("  ", oPattern[i], oPattern[i], pPattern[i], sPattern[i]);
            System.out.println(line);
        }
    }
}