/**
* 00PSBannerApp UC7 - Store Character Pattern in a Class
*
* This use case extends UC6 by implementing a CharacterPatternMap class to encapsulate
* character-to-pattern mappings. The application retrieves and displays the "00PS"
* banner using these mappings. This approach enhances code organization and modularity.
*
* @author Developer
* @version 7.0
*/

public class OOPSBannerApp {

    static class CharacterPatternMap {
        private Character character;
        private String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() { return character; }
        public String[] getPattern() { return pattern; }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {
        return new CharacterPatternMap[] {
            new CharacterPatternMap('O', new String[]{
                "  *****  ", 
                " **   ** ", 
                "**     **", 
                "**     **", 
                "**     **", 
                " **   ** ", 
                "  *****  "  
            }),
            new CharacterPatternMap('P', new String[]{
                "*********",
                "**     **",
                "**     **",
                "*********",
                "**       ",
                "**       ",
                "**       "
            }),
            new CharacterPatternMap('S', new String[]{
                " ********",
                "**       ",
                "**       ",
                " ********",
                "       **",
                "       **",
                "******** "
            }),
            new CharacterPatternMap(' ', new String[]{
                "         ",
                "         ",
                "         ",
                "         ",
                "         ",
                "         ",
                "         "
            })
        };
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        char target = Character.toUpperCase(ch);
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter().equals(target)) {
                return map.getPattern();
            }
        }
        // Fallback to space if character not found
        return getCharacterPattern(' ', charMaps);
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        // Outer loop iterates through the 7 lines of the height
        for (int i = 0; i < 7; i++) {
            StringBuilder lineResult = new StringBuilder();
            
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                // Append the specific row (i) of the character's pattern
                lineResult.append(pattern[i]).append("  "); // 2-space gap between letters
            }
            System.out.println(lineResult.toString());
        }
    }

    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}