import java.util.HashMap;
import java.util.Map;

public class BannerApp {

    // Method to create character patterns
    public static Map<Character, String[]> getCharacterPatterns() {

        Map<Character, String[]> map = new HashMap<>();

        // Pattern for 'O'
        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        // Pattern for 'P'
        map.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        // Pattern for 'S'
        map.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return map;
    }

    // Method to display banner
    public static void printBanner(String text, Map<Character, String[]> patterns) {

        int height = 5; // number of rows in each character

        for (int i = 0; i < height; i++) {   // row loop

            StringBuilder line = new StringBuilder();

            for (char ch : text.toCharArray()) {   // character loop
                String[] pattern = patterns.get(ch);

                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                } else {
                    line.append("     "); // blank for unknown chars
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        // Step 1: Get patterns
        Map<Character, String[]> patterns = getCharacterPatterns();

        // Step 2: Word to print
        String word = "OOPS";

        // Step 3: Print banner
        printBanner(word, patterns);

      
    }
}