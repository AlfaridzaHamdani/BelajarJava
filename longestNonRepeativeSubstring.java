import java.util.HashMap;

class longestNonRepeativeSubstring {
    public static int longestNonRepeativeSubstring(String s) {
        int max = 0, start = 0, i = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while (i < s.length()) {
            char temp = s.charAt(i);

            if (!map.containsKey(temp)) {
                map.put(temp, 0);
            } else if (s.charAt(start) == temp) {
                start++;
            } else if (s.charAt(i - 1) == temp) {
                if (max < map.size()) {
                    max = map.size();
                }
                map = new HashMap<>();
                start = i;
                i--;
            } else {
                if (max < map.size()) {
                    max = map.size();
                }
                while (s.charAt(start) != temp) {
                    map.remove(s.charAt(start));
                    start++;
                }
                start++;
            }
            i++;
        }
        if (max < map.size()) {
            max = map.size();
        }
        return max;
    }

    public static void main(String[] args) {
        String inputString = "abcdeabcdeabcde";
        int result = longestNonRepeativeSubstring(inputString);
        System.out.println("Panjang substring terpanjang tanpa karakter yang diulang: " + result);
    }
}
