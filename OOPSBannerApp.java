/**
* 00PSBannerApp - Use Map for Character Patterns and Render via Function
*
* This use case extends UC7 by utilizing advanced Object-Oriented Programming concepts
* such as the Collections Framework to manage character patterns in a more flexible
* and efficient manner. The application retrieves and displays the "00PS" banner
* using a HashMap there by enhancing code organization and modularity.
*
* @author Developer
* @version 8.0
*/

import java.util.HashMap;

public class OOPSBannerApp {

    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>();

        // Character 'O' - 9 characters wide, 7 lines high
        charMap.put('O', new String[]{
            "  *****  ", // 9 chars
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "  *****  "
        });

        // Character 'P' - 9 characters wide, 7 lines high
        charMap.put('P', new String[]{
            "*********", // 9 chars
            "**     **",
            "**     **",
            "*********",
            "**       ",
            "**       ",
            "**       "
        });

        // Character 'S' - 9 characters wide, 7 lines high
        charMap.put('S', new String[]{
            " ********", // 9 chars
            "**       ",
            "**       ",
            " ******** ",
            "       **",
            "       **",
            "******** "
        });

        // Space character - 9 spaces for spacing between words if needed
        charMap.put(' ', new String[]{
            "         ", "         ", "         ", "         ", "         ", "         ", "         "
        });

        return charMap;
    }

    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        int patternHeight = 7; 

        // Loop through each of the 7 lines of the height
        for (int line = 0; line < patternHeight; line++) {
            StringBuilder sb = new StringBuilder();
            
            // Loop through each character in the input message
            for (char ch : message.toUpperCase().toCharArray()) {
                String[] pattern = charMap.get(ch);
                
                // If character exists, append that specific line; else append blank space
                if (pattern != null) {
                    sb.append(pattern[line]);
                } else {
                    sb.append("         "); // 9 blank spaces
                }
                
                // Adding a 2-space gap between the characters themselves
                sb.append("  "); 
            }
            // Print the fully assembled horizontal line
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, charMap);
    }
}